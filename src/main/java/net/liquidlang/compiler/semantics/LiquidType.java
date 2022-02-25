package net.liquidlang.compiler.semantics;

import net.liquidlang.compiler.ast.FParser;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.Locale;

/**
 * Liquid types.
 */
public enum LiquidType {

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
	 * A droplet structure.
	 */
	DROPLET;

	public static final BigInteger MINIMUM_UNSIGNED = new BigInteger(String.valueOf(0));

	private String identifier = null;

	/**
	 * Creates a {@link LiquidType} from the type context.
	 * @param ctx the type context.
	 * @return the created Liquid type.
	 */
	@Contract(pure = true)
	public static LiquidType fromTypeContext(FParser.@NotNull TypeContext ctx) {
		// boolean
		if(ctx.BOOL() != null) return BOOL;
		// signed
		else if(ctx.I8() != null) return I8;
		else if(ctx.I16() != null) return I16;
		else if(ctx.I32() != null) return I32;
		else if(ctx.I64() != null) return I64;
		else if(ctx.I128() != null) return I128;
		// unsigned
		else if(ctx.U8() != null) return U8;
		else if(ctx.U16() != null) return U16;
		else if(ctx.U32() != null) return U32;
		else if(ctx.U64() != null) return U64;
		else if(ctx.U128() != null) return U128;
		// droplets
		else if(ctx.IDENTIFIER() != null) {
			var type = DROPLET;
			type.identifier = ctx.IDENTIFIER().getText();
			return type;
		} else throw new InternalError(); // this should not happen
	}

	/**
	 * Creates a {@link LiquidType} from the assignment context. If a {@link net.liquidlang.compiler.ast.FParser.TypeContext TypeContext}
	 * is present, this method will delegate to using {@link #fromTypeContext(FParser.TypeContext)}. Otherwise, this method will perform
	 * compiler type inference.
	 * <p>At this moment, it returns a {@link #DROPLET} by default.</p>
	 * @param ctx the assignment context.
	 * @return the created Liquid type.
	 */
	public static LiquidType fromAssignmentContext(FParser.AssignmentContext ctx) {
		if(ctx.type() != null) return fromTypeContext(ctx.type());
		else {
			var type = DROPLET;
			type.identifier = "unknown";
			return type;
		}
	}

	public boolean isPrimitive() {
		System.out.println(this);
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
		return isPrimitive() ? name().toLowerCase(Locale.ROOT) : identifier;
	}
}
