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
import java.util.Base64;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import static net.liquidlang.compiler.util.CompilerLogger.debug;
import static net.liquidlang.compiler.util.CompilerLogger.error;

public final class SymbolUtils {

	@NotNull
	private static final MessageDigest digest = algo();

	private SymbolUtils() {
		//no instance
	}

	@SneakyThrows
	@Contract("-> new")
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
	 * @param backupContext The parent context; it is used to record any errors made while inferring the type.@
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

			// start inferring type
			debug("inferring type of entity '" + backupContext.getText() + "'");

			// cast types are the easiest to infer
			if(ctx.castType() != null) {
				debug("inferring from cast");
				return ObjectType.fromTypeContext(ctx.castType().type());
			}

			// for direct value input
			else if(ctx.value() != null) {
				// glide values can NEVER be null.
				debug("inferring from direct value");
				return resolveValue(ctx.value(), scope);
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
				var func = scope.resolve_function(FunctionDescriptor.from(scope.getName(), ctx.methodCall().IDENTIFIER().getText(), null, types));
				if(func == null) {
					error("cannot infer type: " + backupContext.getText(), backupContext.start.getLine(), backupContext.start.getCharPositionInLine(), backupContext.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
					return null;
				}
				return ObjectType.fromTypeContext(func.functionSignature().type());
			}

			else if(ctx.unsafeBlock() != null || ctx.block() != null) {
				debug("inferring from block");
				var body = (ctx.unsafeBlock() != null ? ctx.unsafeBlock().block() : ctx.block()).body();
				if(SemanticAnalyzer.getReturns(body) != null) {
					return typeCheckAndInference(Objects.requireNonNull(SemanticAnalyzer.getReturns(body)).valueExpr(), ctx, scope);
				} else {
					return ObjectType.VOID;
				}
			}

			else throw new IllegalStateException();

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
			return ObjectType.FUNC;
		} else if(ctx.CharacterLiteral() != null) {
			debug("inferred value as a primitive char");
			return ObjectType.CHAR;
		} else if(ctx.StringLiteral() != null) {
			debug("inferred value as a primitive string");
			return ObjectType.STR;
		} else if(ctx.IntegerLiteral() != null) {
			debug("inferred value as an integer");
			return ObjectType.I32; // to-do
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
			// null initializers have the VOID type
			return ObjectType.VOID;
		}
	}

}
