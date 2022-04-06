package net.liquidlang.compiler.model;

import lombok.Getter;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.util.Modules;
import net.liquidlang.compiler.util.SymbolUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Describes a function. This is used in the {@link net.liquidlang.compiler.semantics.SemanticAnalyzer SemanticAnalyzer}
 * and {@link Scope} classes to hold function info.
 */
public final class FunctionDescriptor {

	@Getter private final String moduleName;
	@Getter private final String identifier;
	@Getter private final ObjectType returnType;
	/**
	 * The mangled identifier of the descriptor, in
	 * accordance with {@link SymbolUtils#mangle_function(String, String, String, Collection)}.
	 * <p>This is returned when calling {@link #toString()}.</p>
	 */
	@Getter private final String mangledIdentifier;

	private final List<ObjectType> objectTypes;
	@Getter private final Collection<FParser.Func_modifiersContext> modifiers;

	private FunctionDescriptor(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType returnType, @NotNull List<ObjectType> objectTypes, Collection<FParser.Func_modifiersContext> mod) {
		this.moduleName = Objects.toString(moduleName);
		this.identifier = identifier;
		this.returnType = returnType;
		this.objectTypes = objectTypes;
		this.modifiers = mod != null ? mod : Collections.emptyList();
		this.mangledIdentifier = SymbolUtils.mangle_function(this.moduleName, Objects.toString(returnType), identifier, objectTypes);
	}

	/**
	 * Creates a {@link FunctionDescriptor} that can reference a function.
	 * <p>This method is just a varargs wrapper for {@link #from(String, String, ObjectType, Collection, List)}.</p>
	 * @param moduleName the module name
	 * @param identifier the function name
	 * @param type the return type of the function
	 * @param objectTypes the object types that are used as parameters of the function
	 * @return a new {@link FunctionDescriptor}.
	 */
	@Contract(pure = true)
	public static @NotNull FunctionDescriptor from(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType type, Collection<FParser.Func_modifiersContext> mod, ObjectType... objectTypes) {
		return from(moduleName, identifier, type, mod, Arrays.asList(objectTypes));
	}

	/**
	 * Creates a {@link FunctionDescriptor} that can reference a function.
	 * @param moduleName the module name
	 * @param identifier the function name
	 * @param type the return type of the function
	 * @param objectTypes the object types that are used as parameters of the function
	 * @return a new {@link FunctionDescriptor}.
	 */
	@Contract(pure = true)
	public static @NotNull FunctionDescriptor from(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType type, Collection<FParser.Func_modifiersContext> mod, List<ObjectType> objectTypes) {
		return new FunctionDescriptor(moduleName, identifier, type, objectTypes, mod);
	}

	@Contract("null -> null")
	public static @Nullable FunctionDescriptor from(@Nullable FParser.FunctionContext ctx) {
		if(ctx == null) return null;
		return new FunctionDescriptor(
				Modules.getModuleNameFromContext(ctx),
				ctx.IDENTIFIER().getText(),
				ObjectType.fromTypeContext(ctx.functionSignature().type()),
				ctx.functionSignature().formalParameterList().formalParameter()
						.stream()
						.map(FParser.FormalParameterContext::type)
						.map(ObjectType::fromTypeContext)
						.collect(Collectors.toList()),
				ctx.func_modifiers()
		);
	}

	@Contract(pure = true)
	public @NotNull @UnmodifiableView List<ObjectType> getParameterTypes() {
		return Collections.unmodifiableList(objectTypes);
	}

	/**
	 * Returns a new {@link FunctionDescriptor} without a return type
	 * (i.e. it is {@code null}).
	 * @return a new {@link FunctionDescriptor} whose return type is {@code null}
	 */
	public @NotNull FunctionDescriptor ignoringReturnTypeAndModifiers() {
		return new FunctionDescriptor(this.moduleName, this.identifier, null, getParameterTypes(), null);
	}

	@Override
	public String toString() {
		return mangledIdentifier;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof FunctionDescriptor that)) return false;
		return new EqualsBuilder().append(moduleName, that.moduleName).append(identifier, that.identifier).append(returnType, that.returnType).append(mangledIdentifier, that.mangledIdentifier).append(objectTypes, that.objectTypes).isEquals(); // don't append modifiers
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(moduleName).append(identifier).append(returnType).append(mangledIdentifier).append(objectTypes).toHashCode();
	}

}