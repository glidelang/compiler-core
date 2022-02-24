package net.liquidlang.compiler.semantics;

import net.liquidlang.compiler.ast.FParser;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * The scope of an object. This is used in conjunction with the symbol table recorded in the origin module ({@code main.lq} or {@code lib.lq}).
 * Functions and variables can be resolved through this class.
 */
public final class Scope implements Cloneable {

	/**
	 * The <em>origin scope</em> of the entire program.
	 */
	public static final Scope ORIGIN_SCOPE = new Scope(null);

	/**
	 * Function mappings.
	 */
	private final Map<String, FParser.FunctionContext> functionMap = new HashMap<>();

	/**
	 * Variable mappings.
	 */
	private final Map<String, FParser.ValueExprContext> variableMap = new HashMap<>();

	private final Scope parentScope;

	/**
	 * Creates a scope with the given parent.
	 */
	@Contract(pure = true)
	private Scope(@Nullable Scope parent) {
		this.parentScope = parent;
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
	@Contract(value = "_ -> new", pure = true)
	public static Scope from_module(@NotNull FParser.CompilationUnitContext context) {
		var scope = new Scope(ORIGIN_SCOPE);
		for(FParser.LineContext ctx : context.line()) {
			// check if the context is a function context
			if(ctx.function() != null) {
				scope.functionMap.put(ctx.function().IDENTIFIER().getText(), ctx.function());
			} else if(ctx.assignment() != null) {
				scope.variableMap.put(ctx.assignment().IDENTIFIER().getText(), ctx.assignment().valueExpr());
			}
		}
		return scope;
	}

	/**
	 * Creates a block-level scope with this instance as its parent.
	 */
	@NotNull
	@Contract(value = "_ -> new", pure = true)
	public Scope childFunction(@NotNull FParser.BodyContext context) {
		var scope = new Scope(this);
		for(FParser.StmtContext ctx : context.stmt()) {
			if(ctx.expr() != null && ctx.expr().assignment() != null) {
				scope.variableMap.put(ctx.expr().assignment().IDENTIFIER().getText(), ctx.expr().assignment().valueExpr());
			}
		}
		return scope;
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
	public FParser.FunctionContext resolve_function(String identifier) {
		if(functionMap.containsKey(identifier)) return functionMap.get(identifier);
		else if(parent() != null) return parent().resolve_function(identifier);
		else {
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
	public FParser.ValueExprContext resolve_variable(String identifier) {
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
}
