package net.liquidlang.compiler.model;

import lombok.Getter;
import lombok.Setter;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.semantics.SemanticAnalyzer;
import net.liquidlang.compiler.util.Modules;
import net.liquidlang.compiler.util.SymbolUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Object types.
 */
@SuppressWarnings("NonFinalFieldInEnum")
public enum ObjectType {

	/**
	 * The 1-bit unsigned integer type, which represents
	 * either {@code true} ({@code 0x1}) or {@code false} ({@code 0x0});
	 */
	BOOL,
	/**
	 * The 8-bit signed integer type.
	 */
	I8,
	/**
	 * The 16-bit signed integer type.
	 */
	I16,
	/**
	 * The 32-bit signed integer type.
	 */
	I32,
	/**
	 * The 64-bit signed integer type.
	 */
	I64,
	/**
	 * The 128-bit signed integer type.
	 */
	I128,
	/**
	 * The 8-bit unsigned integer type.
	 */
	U8,
	/**
	 * The 16-bit unsigned integer type.
	 */
	U16,
	/**
	 * The 32-bit unsigned integer type.
	 */
	U32,
	/**
	 * The 64-bit unsigned integer type.
	 */
	U64,
	/**
	 * The 128-bit unsigned integer type.
	 */
	U128,
	/**
	 * A character value.
	 */
	CHAR,
	/**
	 * A function pointer.
	 */
	FUNC,
	/**
	 * A droplet structure.
	 */
	DROPLET,
	/**
	 * Returns nothing.
	 */
	VOID,
	/**
	 * A string.
	 */
	STR;

	/**
	 * Type name
	 */
	@Getter
	@Setter
	private String identifier = null;

	/**
	 * Whether the {@link ObjectType} could be null.
	 */
	@Getter
	@Setter
	private boolean isNullable = false;

	/**
	 * If the enum instance has a value of {@link #FUNC},
	 * describes the function signature. Note that the {@code identifier}
	 * will <em>always</em> be {@code "__NULL_IDENTIFIER__"}.
	 */
	@Getter
	@Setter
	private FunctionDescriptor descriptor = null;

	/**
	 * Creates a {@link ObjectType} from the type context.
	 * @param ctx the type context.
	 * @return the created Liquid type.
	 */
	@Contract(pure = true)
	public static ObjectType fromTypeContext(FParser.@Nullable TypeContext ctx) {
		ObjectType type;
		if(ctx == null) return VOID;
		else if(ctx.functionType() != null) {
			type = FUNC;
			type.setDescriptor(FunctionDescriptor.from(
					Modules.getModuleNameFromContext(ctx),
					"__NULL_IDENTIFIER__",
					fromTypeContext(ctx.functionType().parameterlessFunctionSignature().type()),
					null, // don't care about them
					ctx.functionType().parameterlessFunctionSignature().typeList().type()
							.stream()
							.map(ObjectType::fromTypeContext)
							.collect(Collectors.toList())
			));
		}
		else if(ctx.CHAR() != null) type = CHAR;
		// boolean
		else if(ctx.BOOL() != null) type = BOOL;
		// signed
		else if(ctx.I8() != null) type = I8;
		else if(ctx.I16() != null) type = I16;
		else if(ctx.I32() != null) type = I32;
		else if(ctx.I64() != null) type = I64;
		else if(ctx.I128() != null) type = I128;
		// unsigned
		else if(ctx.U8() != null) type = U8;
		else if(ctx.U16() != null) type = U16;
		else if(ctx.U32() != null) type = U32;
		else if(ctx.U64() != null) type = U64;
		else if(ctx.U128() != null) type = U128;
		// droplets
		else if(ctx.IDENTIFIER() != null) {
			var t = DROPLET;
			t.identifier = ctx.IDENTIFIER().getText();
			type = t;
		} else if(ctx.STR() != null) type = STR;
		else type = VOID;
		type.setNullable(ctx.QUESTION() != null);
		return type;
	}

	/**
	 * Creates a {@link ObjectType} from the assignment context. If a {@link net.liquidlang.compiler.ast.FParser.TypeContext TypeContext}
	 * is present, this method will delegate to using {@link #fromTypeContext(FParser.TypeContext)}. Otherwise, this method will perform
	 * compiler type inference.
	 * @param ctx the assignment context.
	 * @return the created Liquid type.
	 */
	public static ObjectType fromAssignmentContext(FParser.@NotNull AssignmentContext ctx, Scope scope) {
		if(ctx.type() != null) return fromTypeContext(ctx.type());
		else {
			return SymbolUtils.typeCheckAndInference(ctx.valueExpr(), ctx, scope);
		}
	}

	public boolean isPrimitive() {
		return (this != DROPLET);
	}

	/**
	 * Returns the symbol used to represent the type. This does not validate types: it is the
	 * {@link SemanticAnalyzer}'s responsibility to do so.
	 * @return A symbol to represent the type.
	 */
	@NotNull
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(isPrimitive() ? name().toLowerCase(Locale.ROOT) : identifier).append(isNullable ? "?" : "");
		if(descriptor != null) {
			builder.append("(");
			descriptor.getParameterTypes().forEach(builder::append);
			builder.append(")");
			if(descriptor.getReturnType() != null) {
				builder.append(" -> ");
				builder.append(descriptor.getReturnType());
			}
		}
		return builder.toString();
	}

}
