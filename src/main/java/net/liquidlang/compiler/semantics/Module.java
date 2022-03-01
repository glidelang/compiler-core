package net.liquidlang.compiler.semantics;

import lombok.Value;
import net.liquidlang.compiler.ast.FParser;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class represents a Liquid module after parsing. Only (exported) {@code pub} variables can be accessed through this module, thus
 * allowing for access modifiers to guard the members. This class is immutable and can only be constructed through the {@link Builder}.
 */
@Value
public class Module {

	@Contract(" -> new")
	public static @NotNull Builder builder() {
		return new Builder();
	}

	private Module(Collection<FParser.FunctionContext> fn) {
		functions.addAll(fn);
	}

	Set<FParser.FunctionContext> functions = new HashSet<>();

	public static class Builder {

		private Builder() {
			//no instance
		}

		private final Set<FParser.FunctionContext> exportedFunctions = new HashSet<>();

		/**
		 * Exports a function from the module, allowing for use outside this
		 * module.
		 * @param ctx the function.
		 * @return this builder.
		 */
		@NotNull
		@Contract("_ -> this")
		@SuppressWarnings("UnusedReturnValue")
		public Builder export(@NotNull FParser.FunctionContext... ctx) {
			exportedFunctions.addAll(List.of(ctx));
			return this;
		}

		/**
		 * Exports a function from the module, allowing for use outside this
		 * module.
		 * @param ctx the function.
		 * @return this builder.
		 */
		@NotNull
		@Contract("_ -> this")
		@SuppressWarnings("UnusedReturnValue")
		public Builder export(@NotNull Collection<FParser.FunctionContext> ctx) {
			exportedFunctions.addAll(ctx);
			return this;
		}

		/**
		 * Imports all public symbols from the module.
		 * @param module the module to import.
		 * @return this builder.
		 */
		@NotNull
		@Contract("_ -> this")
		@SuppressWarnings("UnusedReturnValue")
		public Builder importModule(@NotNull Module module) {
			export(module.functions);
			return this;
		}

		/**
		 * Imports all public symbols from the module and puts it in the scope.
		 * @param module the module to import.
		 * @return this builder.
		 */
		@NotNull
		@Contract(value = "_, _ -> this", mutates = "param2")
		@SuppressWarnings("UnusedReturnValue")
		public Builder importModule(@NotNull Module module, @NotNull Scope scope) {
			export(module.functions);
			for(FParser.FunctionContext context : module.functions) {
				// there are only public functions
				scope.functionMap.put(context.IDENTIFIER().getText(), context);
			}
			return this;
		}

		/**
		 * Builds the configuration into a module. The state of this
		 * {@link Builder Builder} instance is also reset, so programmers may use the same builder instance
		 * repeatedly.
		 * @return the newly built module.
		 */
		@NotNull
		@Contract("-> new")
		public Module build() {
			//System.out.println(this);
			var m = new Module(exportedFunctions);
			exportedFunctions.clear();
			return m;
		}

		@Override
		public String toString() {
			return "Builder{" + "exportedFunctions=" + exportedFunctions + '}';
		}
	}

}
