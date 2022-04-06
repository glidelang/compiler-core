package net.liquidlang.compiler.util;

import lombok.SneakyThrows;
import net.liquidlang.compiler.ast.*;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.model.FunctionDescriptor;
import net.liquidlang.compiler.model.ObjectType;
import net.liquidlang.compiler.model.Scope;
import net.liquidlang.compiler.model.VariableDescriptor;
import net.liquidlang.compiler.semantics.SemanticAnalyzer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import static net.liquidlang.compiler.util.CompilerLogger.*;

public final class SymbolUtils {

	private SymbolUtils() {
		//no instance
	}

	@SneakyThrows
	@Contract(pure = true)
	private static MessageDigest algo() {
		return MessageDigest.getInstance("SHA3-224");
	}

	/**
	 * Returns the Liquid-mangled function name for a given function.
	 * <p>The function mangling procedure <em>may change anytime</em>.</p>
	 * @param filename The filename.
	 * @param return_type The return type for the function. This is to facilitate return type overloading.
	 * @param name The function name
	 * @param objectTypes The parameters
	 * @return the Liquid-mangled function name for a given function.
	 */
	@Contract(pure = true)
	public static @NotNull String mangle_function(@NotNull String filename, @NotNull String return_type, @NotNull String name, @NotNull Collection<ObjectType> objectTypes) {
		return "glide_" + filename + "__" + return_type + "_" + name + "_" + objectTypes.size();
	}

	@Contract(pure = true)
	public static @NotNull String functionToString(FParser.@NotNull FunctionContext context) {
		return Arrays.toString(context.func_modifiers().stream().map(RuleContext::getText).toArray()).replace("[", "").replace("]", " ").replace(",", "")
				+ context.IDENTIFIER() + "("
				+ StringUtils.removeEnd(StringUtils.removeStart(Arrays.toString(context.functionSignature().formalParameterList().formalParameter().stream().map(formalParameterContext -> formalParameterContext.type().getText()).toArray()), "["), "]") + ") returning "
				+ (context.functionSignature().type() == null ? "void" : context.functionSignature().type().getText());
	}

	@NotNull
	@Contract(pure = true)
	private static String toHex(@NotNull String arg) {
		return String.format("%040x", new BigInteger(1, arg.getBytes(StandardCharsets.UTF_8)));
	}

	/**
	 * This method is used to validate that the type of the variable matches the type of the value, through eager inference of value expressions.
	 * @param ctx The nullable context to validate. The compiler will not throw an exception but instead raise the error flag in {@link LiquidErrorHandler}.
	 * @param backupContext The parent context; it is used to record any errors made while inferring the type.
	 * @param scope The scope of the assignment. It will be used to get the type of variables and functions.
	 * @return The {@link ObjectType} of the value expression if not null, else {@code null}.
	 */
	@Contract(value = "!null, _, _ -> _; null, _, _ -> null", pure = true)
	public static @Nullable ObjectType typeCheckAndInference(@Nullable FParser.ValueExprContext ctx, @NotNull ParserRuleContext backupContext, @NotNull Scope scope) {
		if(ctx == null) {
			error("cannot infer type: " + backupContext.getText(), backupContext.start.getLine(), backupContext.start.getCharPositionInLine(), backupContext.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
			return null;
		} else {

			ObjectType objectType;

			// start inferring type
			debug("inferring type of entity '" + backupContext.getText() + "'");

			// cast types are the easiest to infer
			if(ctx.castType() != null) {
				debug("inferring from cast");
				objectType = ObjectType.fromTypeContext(ctx.castType().type());
			}

			// for direct value input
			else if(ctx.value() != null) {
				// glide values can NEVER be null.
				debug("inferring from direct value");
				objectType = resolveValue(ctx.value(), scope);
			}

			// for function calls
			else if(ctx.methodCall() != null) {
				debug("inferring from method call");
				var types = ctx.methodCall()
						.passedParameterList()
						.valueExpr()
						.stream() // the order is important
						.map(valueContext -> SymbolUtils.typeCheckAndInference(valueContext, ctx, scope))
						.toList();
				var func = scope.resolve_function(FunctionDescriptor.from(scope.getModuleName(), ctx.methodCall().IDENTIFIER().getText(), null, null, types));
				if(func == null) {
					error("cannot infer type: " + backupContext.getText(), backupContext.start.getLine(), backupContext.start.getCharPositionInLine(), backupContext.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
					return null;
				}
				objectType = ObjectType.fromTypeContext(func.functionSignature().type());
			}

			else if(ctx.unsafeBlock() != null || ctx.block() != null) {
				debug("inferring from block");
				var body = (ctx.unsafeBlock() != null ? ctx.unsafeBlock().block() : ctx.block()).body();
				if(SemanticAnalyzer.getReturns(body) != null) {
					return typeCheckAndInference(Objects.requireNonNull(SemanticAnalyzer.getReturns(body)).valueExpr(), ctx, scope);
				} else {
					objectType = ObjectType.VOID;
				}
			}

			else throw new IllegalStateException();

			for(var op : ctx.nullValueExprOperators()) {
				if(op.BANG() != null) {
					// objectType panics if null
					assert objectType != null;
					objectType.setNullable(false);
				} else if(op.TILDE() != null) {
					// ~ returns bool on nullability
					objectType = ObjectType.BOOL;
				}
			}

			return objectType;

		}
	}

	// make it private so the semantic analyzer can't avoid the Glide nullability check
	@Contract(pure = true)
	private static @Nullable ObjectType resolveValue(@NotNull FParser.ValueContext ctx, @NotNull Scope scope) {
		if(ctx.BooleanLiteral() != null) {

			debug("inferred value as a primitive bool");
			return ObjectType.BOOL;

		} else if(ctx.functionValue() != null) {

			debug("inferred value as a function pointer");
			var func = ObjectType.FUNC;
			func.setDescriptor(FunctionDescriptor.from(
					scope.getModuleName(),
					ctx.functionValue().IDENTIFIER().getText(),
					ctx.functionValue().parameterlessFunctionSignature().type() != null
							? ObjectType.fromTypeContext(ctx.functionValue().parameterlessFunctionSignature().type())
							: ObjectType.VOID,
					null,
					ctx.functionValue().parameterlessFunctionSignature().typeList().type()
							.stream()
							.map(ObjectType::fromTypeContext)
							.collect(Collectors.toList())
			));
			return func;

		} else if(ctx.closure() != null) {

			debug("inferred value as a closure");
			var func = ObjectType.FUNC;
			func.setDescriptor(FunctionDescriptor.from(
					scope.getModuleName(),
					getClosureFunctionName(scope.closureCount++),
					ctx.closure().functionSignature().type() != null
							? ObjectType.fromTypeContext(ctx.functionValue().parameterlessFunctionSignature().type())
							: ObjectType.VOID,
					null,
					ctx.closure().functionSignature().formalParameterList().formalParameter()
							.stream()
							.map(e -> ObjectType.fromTypeContext(e.type()))
							.collect(Collectors.toList())
			));
			return func;

		} else if(ctx.CharacterLiteral() != null) {

			debug("inferred value as a primitive char");
			return ObjectType.CHAR;

		} else if(ctx.StringLiteral() != null) {

			debug("inferred value as a primitive string");
			return ObjectType.STR;

		} else if(ctx.IntegerLiteral() != null) {

			debug("inferred value as an integer");
			return ObjectType.I32;

		} else if(ctx.newStatement() != null) {

			debug("inferred value as a droplet");
			debug("attempting to resolve type name");
			var droplet = ObjectType.DROPLET;
			var name = ctx.newStatement().IDENTIFIER().getText();
			droplet.setIdentifier(name); // name
			debug("resolved type name as " + name);
			return droplet;

		} else if(ctx.IDENTIFIER() != null) {

			debug("inferring value from another variable");
			var inf = scope.resolve_variable(VariableDescriptor.wildcard_from(ctx.IDENTIFIER().getText(), scope.hashCode()));
			if(inf == null) {
				debug("unable to infer from variable");
			} else {
				debug("inferred value as " + inf);
			}
			return inf;

		} else {
			return ObjectType.VOID;
		}
	}

	@Contract(pure = true)
	private static @NotNull String getClosureFunctionName(long c) {
		return "$$$closure" + c + "$$$";
	}

	/**
	 * Checks all return statements to make sure that their values conform
	 * to the specified {@link ObjectType}, which is the return type
	 * of the function.
	 * @param contexts The collection of {@link net.liquidlang.compiler.ast.FParser.StmtContext StmtContexts} to check.
	 * @param returnType The {@link ObjectType} in which all return statements given in {@code contexts} must conform to.
	 * @param scope The scope to search variables for, if necessary.
	 * @param backup The backup context for error reporting.
	 */
	public static void checkReturnStatements(@NotNull Collection<FParser.StmtContext> contexts, @NotNull ObjectType returnType, @NotNull Scope scope, @NotNull ParserRuleContext backup) {
		contexts.stream()
				.filter(ctx -> ctx.returnStatement() != null)
				.filter(ctx -> typeCheckAndInference(ctx.returnStatement().valueExpr(), backup, scope) != returnType)
				.forEach(ctx -> {
					error("non-matching return types: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
				});
	}

	/**
	 * Returns the (direct or indirect) parent of the given context {@code context},
	 * based on the class parameter {@code clazz}.
	 * @param context The {@link RuleContext} to check. If {@code null}, returns {@code null}.
	 * @param clazz The class of the {@link ParserRuleContext} to use as the parent class. Can never be {@code null}.
	 * @return The parent context if found, else {@code null}.
	 */
	@SuppressWarnings("unchecked")
	@Contract("null, _ -> null")
	public static <T extends RuleContext> @Nullable T getNearestParentOfContext(@Nullable RuleContext context, @NotNull Class<? extends RuleContext> clazz) {
		if(context == null || context.parent == null) return null;
		else if(context.parent.getClass() == clazz) return (T) context;
		else return getNearestParentOfContext(context.parent, clazz);
	}

}
