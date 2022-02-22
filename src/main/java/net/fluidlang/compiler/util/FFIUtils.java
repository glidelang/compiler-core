package net.fluidlang.compiler.util;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

public final class FFIUtils {

	@NotNull
	private static final MessageDigest digest = algo();

	private FFIUtils() {
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
		return "f" + toHex(Base64.getEncoder().encodeToString(digest.digest(filename.getBytes(StandardCharsets.UTF_8)))) + "_" + return_type + "_" + name + "" + param_overload_count;
	}

	@NotNull
	@Contract(pure = true)
	private static String toHex(@NotNull String arg) {
		return String.format("%040x", new BigInteger(1, arg.getBytes(StandardCharsets.UTF_8)));
	}

}
