package net.liquidlang.compiler.model;

import lombok.Getter;
import net.liquidlang.compiler.ast.FParser;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

import java.util.Collection;
import java.util.Set;

/**
 * Describes a variable.
 */
public final class VariableDescriptor {

	@Getter private final ObjectType container;
	@Getter private final String identifier;
	@Getter private final boolean mutable;
	@Getter private final boolean inline;
	@Getter private final boolean isStatic;
	@Getter private final int scopeHashCode;

	private VariableDescriptor(String identifier, boolean mutable, boolean inline, boolean stat, int scopeHashCode, @UnknownNullability ObjectType container) {
		this.identifier = identifier;
		this.mutable = mutable;
		this.inline = inline;
		this.isStatic = stat;
		this.scopeHashCode = scopeHashCode;
		this.container = container;
	}

	@Contract("_, _, _, _ -> new")
	public static @NotNull VariableDescriptor from(@NotNull String identifier, int scopeHashCode, @NotNull ObjectType hold, @NotNull FParser.Variable_modifiersContext... modifiers) {
		return from(identifier, scopeHashCode, hold, Set.of(modifiers));
	}

	@Contract("_, _, _, _ -> new")
	public static @NotNull VariableDescriptor from(@NotNull String identifier, int scopeHashCode, @NotNull ObjectType hold, @NotNull Collection<FParser.Variable_modifiersContext> modifiers) {
		boolean sta = false;
		boolean mut = false;
		boolean in = false;
		for(FParser.Variable_modifiersContext context : modifiers) {
			if(context.MUTABLE() != null) {
				mut = true;
			} else if(context.INLINE() != null) {
				in = true;
			} else if(context.STATIC() != null) {
				sta = true;
			}
		}
		return new VariableDescriptor(identifier, mut, in, sta, scopeHashCode, hold);
	}

	// Wildcard: match to the variable in the nearest scope
	public static @NotNull VariableDescriptor wildcard_from(@NotNull String identifier, int scopeHashCode) {
		return new VariableDescriptor(identifier, false, false, false, scopeHashCode, null);
	}

	@Override
	public String toString() {
		return identifier;
	}

	public String toStringDebug() {
		return new ToStringBuilder(this).append("container", container).append("identifier", identifier).append("mutable", mutable).append("inline", inline).append("isStatic", isStatic).append("scopeHashCode", scopeHashCode).toString();
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;

		if(!(o instanceof VariableDescriptor that)) return false;

		return new EqualsBuilder().append(mutable, that.mutable).append(inline, that.inline).append(isStatic, that.isStatic).append(identifier, that.identifier).append(scopeHashCode, that.scopeHashCode).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(7025839, 67038951).append(identifier).append(mutable).append(inline).append(isStatic).toHashCode();
	}

}
