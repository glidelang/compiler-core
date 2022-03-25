package net.liquidlang.compiler.model;

import lombok.Getter;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.util.CompilerLogger;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static net.liquidlang.compiler.util.CompilerLogger.debug;

/**
 * The scope of an object. This is used in conjunction with the symbol table recorded in the origin module ({@code main.lq} or {@code lib.lq}).
 * Functions and variables can be resolved through this class.
 */
public final class Scope implements Cloneable {

	/**
	 * The <em>origin scope</em> of the entire program.
	 */
	public static final Scope ORIGIN_SCOPE = new Scope(null, "main");

	/**
	 * Function mappings.
	 */
	public final Map<FunctionDescriptor, FParser.FunctionContext> functionMap = new HashMap<>();

	/**
	 * Variable mappings.
	 */
	public final Map<String, ObjectType> variableMap = new HashMap<>();

	private final Scope parentScope;
	@Getter
	private final String name;
	// random, for debugging
	private final UUID uuid = UUID.randomUUID();

	/**
	 * Creates a scope with the given parent.
	 */
	@Contract(pure = true)
	private Scope(@Nullable Scope parent, String name) {
		this.parentScope = parent;
		this.name = name;
	}

	/**
	 * Creates a module-level scope from the module's name. For origin modules, the constant {@link #ORIGIN_SCOPE} is used.
	 * <p>
	 *     The parent of the newly-created scope is set as {@link #ORIGIN_SCOPE} because <em>one module can only
	 *     be defined per file</em>.
	 * </p>
	 * @param context the context of the module.
	 * @return a newly created {@link Scope} from the module.
	 */
	@NotNull
	@Contract(value = "_, _ -> new", pure = true)
	public static Scope from_module(@NotNull FParser.CompilationUnitContext context, @NotNull String name) {
		var scope = new Scope(ORIGIN_SCOPE, name);
		for(FParser.LineContext ctx : context.line()) {
			// check if the context is a function context
			if(ctx.function() != null) {
				scope.functionMap.put(FunctionDescriptor.from(name, ctx.function().IDENTIFIER().getText(), ObjectType.fromTypeContext(ctx.function().functionSignature().type()), ctx.function().functionSignature().formalParameterList().formalParameter().stream().map(formalParameterContext -> ObjectType.fromTypeContext(formalParameterContext.type())).toArray(ObjectType[]::new)), ctx.function());
			} else if(ctx.assignment() != null) {
				scope.variableMap.put(ctx.assignment().IDENTIFIER().getText(), ObjectType.fromTypeContext(ctx.assignment().type()));
			}
		}
		CompilerLogger.debug("function map: " + scope.functionMap);
		CompilerLogger.debug("variable map: " + scope.variableMap);
		return scope;
	}

	/**
	 * Creates a child {@link Scope}.
	 */
	@NotNull
	@Contract(value = "-> new", pure = true)
	public Scope child() {
		return new Scope(this, name);
	}

	@Nullable
	@Contract(pure = true)
	public Scope parent() {
		return parentScope;
	}

	/**
	 * Resolves a function recursively through parent {@link Scope Scopes}. The semantic analyzer
	 * is supposed to log errors where functions cannot be resolved.
	 * @param identifier The Liquid identifier to resolve.
	 * @return A function or {@code null} if not found.
	 */
	@Nullable
	public FParser.FunctionContext resolve_function(@NotNull FunctionDescriptor identifier) {

		CompilerLogger.debug("attempting to resolve function with identifier " + identifier + " in scope " + Integer.toHexString(hashCode()));

		if(identifier.getReturnType() == null) {

			// for validity: if not specified then there must only be one function of that identifier that returns only one type
			// else it is ambiguous; return type can only be null if 'identifier1' is not overloaded in return type

			boolean duplicateFlag = false;
			FParser.FunctionContext context = null;

			CompilerLogger.debug("iterating through entry set of " + functionMap.entrySet());

			// no duplicates
			for(var fun : functionMap.entrySet()) {
				var functionDescriptor = fun.getKey();
				debug("trying to resolve: " + identifier);
				debug("trying function descriptor: " + functionDescriptor);
				debug(identifier.ignoringReturnType().getMangledIdentifier() + " vs " + functionDescriptor.ignoringReturnType().getMangledIdentifier());
				debug("do they match: " + identifier.ignoringReturnType().getMangledIdentifier().equals(functionDescriptor.ignoringReturnType().getMangledIdentifier()));
				if(identifier.ignoringReturnType().getMangledIdentifier().equals(functionDescriptor.ignoringReturnType().getMangledIdentifier())) {
					if(!duplicateFlag) {
						CompilerLogger.debug("resolved function with identifier " + functionDescriptor.getMangledIdentifier() + " in scope " + Integer.toHexString(hashCode()));
						context = functionMap.get(functionDescriptor);
						duplicateFlag = true;
					} else {
						// duplicates present
						CompilerLogger.error("ambiguous function call '" + identifier.getIdentifier() + "' with params " + identifier.getParameterTypes() + " in module '" + identifier.getModuleName() + "'");
						LiquidErrorHandler.errors++;
						return null;
					}
				}
			}

			if(context != null) {
				return context;
			}

		}

		if(functionMap.containsKey(identifier)) {
			CompilerLogger.debug("resolved function with identifier " + identifier.getMangledIdentifier() + " in scope " + Integer.toHexString(hashCode()));
			return functionMap.get(identifier);
		} else if(parent() != null) {
			CompilerLogger.debug("unable to resolve function with identifier " + identifier.getMangledIdentifier() + " in scope " + Integer.toHexString(hashCode()));
			CompilerLogger.debug("resolving through parent");
			return parent().resolve_function(identifier);
		} else {
			CompilerLogger.debug("unable to resolve function with identifier " + identifier.getMangledIdentifier() + " in entire program");
			return null;
		}

	}

	/**
	 * Resolves a function recursively through parent {@link Scope Scopes}. The semantic analyzer
	 * is supposed to log errors where functions cannot be resolved.
	 * @param identifier The Liquid identifier to resolve.
	 * @return A function or {@code null} if not found.
	 */
	@Nullable
	public ObjectType resolve_variable(String identifier) {
		if(variableMap.containsKey(identifier)) return variableMap.get(identifier);
		else if(parent() != null) return parent().resolve_variable(identifier);
		else {
			return null;
		}
	}

	@Override
	public Scope clone() throws CloneNotSupportedException {
		return (Scope) super.clone();
	}

	@Override
	public String toString() {
		return "Scope{" + "functionMap=" + functionMap + ", variableMap=" + variableMap + ", parentScope=" + parentScope + '}';
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Scope scope)) return false;
		return new EqualsBuilder().append(parentScope, scope.parentScope).isEquals();
	}

	/**
	 * This value will remain constant.
	 * @return the unique ID of the scope.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(parentScope).append(uuid).toHashCode();
	}

}