package net.liquidlang.compiler.model;

import lombok.Getter;
import net.liquidlang.compiler.util.SymbolUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

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

	private final Collection<ObjectType> objectTypes;

	private FunctionDescriptor(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType returnType, @NotNull Collection<ObjectType> objectTypes) {
		this.moduleName = Objects.toString(moduleName);
		this.identifier = identifier;
		this.returnType = returnType;
		this.objectTypes = objectTypes;
		this.mangledIdentifier = SymbolUtils.mangle_function(this.moduleName, Objects.toString(returnType), identifier, objectTypes);
	}

	/**
	 * Creates a {@link FunctionDescriptor} that can reference a function.
	 * <p>This method is just a varargs wrapper for {@link #from(String, String, ObjectType, Collection)}.</p>
	 * @param moduleName the module name
	 * @param identifier the function name
	 * @param type the return type of the function
	 * @param objectTypes the object types that are used as parameters of the function
	 * @return a new {@link FunctionDescriptor}.
	 */
	@Contract("_, _, _, _ -> new")
	public static @NotNull FunctionDescriptor from(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType type, ObjectType... objectTypes) {
		return from(moduleName, identifier, type, Arrays.asList(objectTypes));
	}

	/**
	 * Creates a {@link FunctionDescriptor} that can reference a function.
	 * @param moduleName the module name
	 * @param identifier the function name
	 * @param type the return type of the function
	 * @param objectTypes the object types that are used as parameters of the function
	 * @return a new {@link FunctionDescriptor}.
	 */
	@Contract(value = "_, _, _, _ -> new", pure = true)
	public static @NotNull FunctionDescriptor from(@Nullable String moduleName, @NotNull String identifier, @Nullable ObjectType type, Collection<ObjectType> objectTypes) {
		return new FunctionDescriptor(moduleName, identifier, type, objectTypes);
	}

	@Contract(pure = true)
	public @NotNull @UnmodifiableView Collection<ObjectType> getParameterTypes() {
		return Collections.unmodifiableCollection(objectTypes);
	}

	/**
	 * Returns a new {@link FunctionDescriptor} without a return type
	 * (i.e. it is {@code null}).
	 * @return a new {@link FunctionDescriptor} whose return type is {@code null}
	 */
	public @NotNull FunctionDescriptor ignoringReturnType() {
		return new FunctionDescriptor(this.moduleName, this.identifier, null, getParameterTypes());
	}

	@Override
	public String toString() {
		return mangledIdentifier;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof FunctionDescriptor that)) return false;
		return new EqualsBuilder().append(moduleName, that.moduleName).append(identifier, that.identifier).append(returnType, that.returnType).append(mangledIdentifier, that.mangledIdentifier).append(objectTypes, that.objectTypes).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(moduleName).append(identifier).append(returnType).append(mangledIdentifier).append(objectTypes).toHashCode();
	}

}