package net.liquidlang.compiler.model;

import lombok.Getter;
import net.liquidlang.compiler.ast.FParser;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * This class represents a Liquid module after parsing. Only (exported) {@code pub} variables can be accessed through this module, thus
 * allowing for access modifiers to guard the members. This class is immutable and can only be constructed through the {@link Builder}.
 */
public class Module {

	private final int hashCode;
	@Getter private final String name;

	@Contract("_ -> new")
	public static @NotNull Builder builder(String name) {
		return new Builder(name);
	}

	// hashCodes are always constant
	private Module(Collection<FParser.FunctionContext> fn, int hashCode, String name) {
		this.hashCode = hashCode;
		this.name = name;
		functions.addAll(fn);
	}

	@Getter
	private final Set<FParser.FunctionContext> functions = new HashSet<>();

	public static class Builder {

		private final String name;

		private Builder(String name) {
			//no instance
			this.name = name;
		}

		private final Set<FParser.FunctionContext> exportedFunctions = new HashSet<>();
		@Getter
		private final Set<Module> importedModules = new HashSet<>();
		private final int hashcode = new HashCodeBuilder(1342189, 47891).append(UUID.randomUUID()).toHashCode();

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
			importedModules.add(module);
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
			importedModules.add(module);
			for(FParser.FunctionContext context : module.functions) {
				// there are only public functions
				scope.functionMap.put(FunctionDescriptor.from(module.name, context.IDENTIFIER().getText(), ObjectType.fromTypeContext(context.functionSignature().type()), context.functionSignature().formalParameterList().formalParameter().stream().map(formalParameterContext -> ObjectType.fromTypeContext(formalParameterContext.type())).toArray(ObjectType[]::new)), context);
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
			var m = new Module(exportedFunctions, hashcode, name);
			exportedFunctions.clear();
			return m;
		}

		@Override
		public String toString() {
			return "Builder{" + "exportedFunctions=" + exportedFunctions + '}';
		}

		@Override
		public int hashCode() {
			return hashcode;
		}
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Module module)) return false;
		return functions.equals(module.functions);
	}

	@Override
	public int hashCode() {
		return hashCode;
	}
}
