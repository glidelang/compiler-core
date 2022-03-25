package net.liquidlang.compiler.util;

import lombok.SneakyThrows;
import net.liquidlang.compiler.ast.*;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.model.FunctionDescriptor;
import net.liquidlang.compiler.model.ObjectType;
import net.liquidlang.compiler.model.Scope;
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
	 * @param param_overload_count The parameter overload count for the function. This is determined by the number of function symbols
	 *                             referring to the function name. If there were two functions {@code a(int)} and {@code a(b)}, the overload
	 *                             count would be 1, as the formula for overload count is {@code symbol_count - 1}. This is not affected by
	 *                             return type overloading, as it is determined in {@code return_type}.
	 * @return the Liquid-mangled function name for a given function.
	 */
	@Contract(pure = true)
	public static @NotNull String mangle_function(@NotNull String filename, @NotNull String return_type, @NotNull String name, int param_overload_count) {
		return "glide_" + filename + "__" + return_type + "_" + name + "" + param_overload_count;
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
				return ObjectType.fromTypeContext(ctx.castType().type());
			}

			// for direct value input
			else if(ctx.value() != null) {
				return resolveValue(ctx.value(), backupContext);
			}

			// for function calls
			else if(ctx.methodCall() != null) {
				var types = ctx.methodCall()
						.passedParameterList()
						.value()
						.stream() // the order is important
						.map(valueContext -> resolveValue(valueContext, backupContext))
						.toList();
				var func = scope.resolve_function(FunctionDescriptor.from(scope.getName(), ctx.methodCall().IDENTIFIER().getText(), null, types));
				if(func == null) {
					error("cannot infer type: " + backupContext.getText(), backupContext.start.getLine(), backupContext.start.getCharPositionInLine(), backupContext.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
					return null;
				}
				return ObjectType.fromTypeContext(func.functionSignature().type());
			}

			else throw new IllegalStateException();

		}
	}

	@Contract(pure = true)
	public static @Nullable ObjectType resolveValue(@NotNull FParser.ValueContext ctx, @NotNull ParserRuleContext backupContext) {
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
			return ObjectType.I128; // to-do
		} else if(ctx.newStatement() != null) {
			debug("inferred value as a droplet");
			debug("attempting to resolve type name");
			var droplet = ObjectType.DROPLET;
			var name = ctx.newStatement().IDENTIFIER().getText();
			droplet.setIdentifier(name); // name
			debug("resolved type name as " + name);
			return droplet;
		} else {
			error("cannot infer type of null initializer: " + backupContext.getText(), backupContext.start.getLine(), backupContext.start.getCharPositionInLine(), backupContext.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
			return null;
		}
	}

}
