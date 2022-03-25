package net.liquidlang.compiler.semantics;

import lombok.Getter;
import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.model.FunctionDescriptor;
import net.liquidlang.compiler.model.ObjectType;
import net.liquidlang.compiler.model.Module;
import net.liquidlang.compiler.model.Scope;
import net.liquidlang.compiler.util.CompilerLogger;
import net.liquidlang.compiler.util.SymbolUtils;
import net.liquidlang.compiler.ast.*;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.time.StopWatch;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static net.liquidlang.compiler.util.CompilerLogger.*;

/**
 * Validates syntax and assignment.
 */
public class SemanticAnalyzer extends FParserBaseListener {

	private final String name;
	private Scope currentScope = null;
	@Getter private Module result;
	private final Module.Builder builder;

	// We don't want to let the compiler crash to a StackOverflowError because we recursively
	// tried parsing modules.
	private static final List<String> circularDependencyPrevention = new ArrayList<>();
	private final StopWatch stopWatch = new StopWatch();

	/**
	 * Constructs a {@link SemanticAnalyzer} that is parsing the given module name.
	 * @param name the module name, used for semantic checking and lazy imports
	 */
	public SemanticAnalyzer(String name) {
		this.name = name;
		this.builder = Module.builder(name);
	}

	@Contract(pure = true)
	private boolean hasDuplicateRuleContext(@NotNull List<? extends RuleContext> listContainingDuplicates) {
		Set<String> set1 = new HashSet<>();
		for(RuleContext obj : listContainingDuplicates) {
			if(!set1.add(obj.getText())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Handles main module checks.
	 * @param context the compilation unit to check.
	 */
	private void handleMainChecks(FParser.@NotNull CompilationUnitContext context) {
		for(FParser.LineContext ctxTemp : context.line()) {
			var ctx = ctxTemp.function();
			if(ctx != null) {
				if(ctx.IDENTIFIER().getText().equals("main")) {
					debug("discovered main function in module " + name);
					debug("checking for invalid modifiers");
					boolean pub = ctx.getText().contains("pub"), extern = ctx.getText().contains("ext"), inline = ctx.getText().contains("inline");
					if(!pub) {
						error("main function must be public: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
						LiquidErrorHandler.errors++;
					}
					if(extern) {
						error("main function must not be extern: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
						LiquidErrorHandler.errors++;
					}
					if(inline) {
						error("main function must not be inline: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
						LiquidErrorHandler.errors++;
					}
				}
			}
		}
	}

	// ================================================================================== init-scope (module)

	@Override
	public void enterCompilationUnit(@NotNull FParser.CompilationUnitContext ctx) {
		debug("begun compilation of module " + name);
		debug("checking main function");
		handleMainChecks(ctx);
		stopWatch.start();
		currentScope = Scope.from_module(ctx, name);
		debug("initialized scope " + Integer.toHexString(currentScope.hashCode()) + " with parent " + (currentScope.parent() != null ? Integer.toHexString(currentScope.parent().hashCode()) : "as itself"));
	}

	// Make sure to create the module
	@Override
	public void exitCompilationUnit(FParser.CompilationUnitContext ctx) {
		stopWatch.stop();
		currentScope = null;
		result = builder.build();
		debug("module " + name + " built in " + stopWatch.getTime(TimeUnit.MILLISECONDS) + "ms");
	}

	// ================================================================================== destroy-scope (module)

	// ================================================================================== init-scope (blocks)

	@Override
	public void enterFunction(@NotNull FParser.FunctionContext ctx) {

		debug("discovered function " + SymbolUtils.functionToString(ctx));
		debug("checking for duplicate modifiers");

		// check for duplicate modifiers
		if(hasDuplicateRuleContext(ctx.func_modifiers())) {
			error("duplicate modifiers in function: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		}

		// check if the function returns a value
		if(ctx.functionSignature().type() != null) {
			debug("returned type discovered as " + ctx.functionSignature().type().getText());
			debug("checking for return statement");
			if(ctx.block().body().returnStatement() == null) {
				error("missing return statement in function: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			}
		} else {
			debug("skipping return check; function implicitly returns void");
		}

		boolean isStatic = false;

		for(FParser.Func_modifiersContext x : ctx.func_modifiers()) {
			if(x.PUBLIC() != null) {
				debug("function is public, exporting: " + SymbolUtils.functionToString(ctx));
				builder.export(ctx);
			} else if(x.STATIC() != null) {
				isStatic = true;
			}
		}

		debug("checking for explicitly static functions in module level");
		// current scope should be module level if we are in a module
		if(Objects.requireNonNull(currentScope.parent(), "illegal, this shouldn't happen!").hashCode() == Scope.ORIGIN_SCOPE.hashCode() && isStatic) {
			warn("function is already static at the module level, consider removing the static modifier: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.warns++;
		}

	}

	@Override public void enterBody(FParser.BodyContext ctx) { currentScope = currentScope.child(); }
	@Override public void exitBody(FParser.BodyContext ctx) { currentScope = currentScope.parent(); }

	// ================================================================================== destroy-scope (body)

	@Override
	public void enterMethodCall(@NotNull FParser.MethodCallContext ctx) {

		// check symbol table for function
		debug("attempting to resolve function call '" + ctx.getText() + "'");
		var fun = currentScope.resolve_function(FunctionDescriptor.from(name, ctx.IDENTIFIER().getText(), null, ctx.passedParameterList().value().stream().map(valueContext -> SymbolUtils.resolveValue(valueContext, ctx)).toArray(ObjectType[]::new)));
		if(fun == null) {
			// function might be in a different module
			for(Module module : builder.getImportedModules()) {
				if(fun == null) {
					fun = currentScope.resolve_function(FunctionDescriptor.from(module.getName(), ctx.IDENTIFIER().getText(), null, ctx.passedParameterList().value().stream().map(valueContext -> SymbolUtils.resolveValue(valueContext, ctx)).toArray(ObjectType[]::new)));
				} else {
					break;
				}
			}
			if(fun == null) {
				debug("unable to resolve function in scope " + Integer.toHexString(currentScope.hashCode()));
				error("unknown function: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			}
		} else {
			debug("resolved function call '" + ctx.getText() + "' as " + SymbolUtils.functionToString(fun));
		}

	}

	@Override
	public void enterAssignment(FParser.AssignmentContext ctx) {

		// check for existing variable in current scope
		if(currentScope.variableMap.containsKey(ctx.IDENTIFIER().getText())) {
			debug("variable declared more than once in scope " + Integer.toHexString(currentScope.hashCode()));
			error("cannot declare a variable with the same name: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {
			// add to the current scope
			currentScope.variableMap.put(ctx.IDENTIFIER().getText(), ObjectType.fromAssignmentContext(ctx, currentScope));
		}

	}

	// we do not need to keep track of assignments as we are not writing a runtime
	@Override
	public void enterReassignment(FParser.ReassignmentContext ctx) {

		// check symbol table for variable
		debug("entered reassignment statement");
		ObjectType type = currentScope.resolve_variable(ctx.IDENTIFIER().getText());
		if(type == null) {
			debug("cannot find variable in scope " + Integer.toHexString(currentScope.hashCode()));
			error("unknown variable: " + ctx.IDENTIFIER(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {
			debug("type checking value '" + ctx.valueExpr().getText() + "' with type " + type);
		}

	}

	@SuppressWarnings("SameParameterValue")
	private <T> @NotNull Set<T> findDuplicates(@NotNull Collection<T> collection) {
		Set<T> duplicates = new LinkedHashSet<>();
		Set<T> uniques = new HashSet<>();
		for(T t : collection) {
			if(!uniques.add(t)) {
				duplicates.add(t);
			}
		}
		return duplicates;
	}

	@Override
	public void enterImportStatement(FParser.ImportStatementContext ctx) {
		debug("entered import statement");
		if(ImportManager.isLocalImport(ctx)) {
			var x = ctx.IDENTIFIER().get(ctx.IDENTIFIER().size() - 1).getText();
			if(!ImportManager.isContainedLocally(x)){
				debug("cannot find module in compilation target files");
				error("unknown local module: " + x, ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				debug("adding module name to module access order list");
				circularDependencyPrevention.add("'" + StringUtils.removeEnd(Paths.get(ctx.start.getTokenSource().getSourceName()).getFileName().toString(), ".lq") + "'");
				if(!findDuplicates(circularDependencyPrevention).isEmpty()) {
					debug("found duplicates indicating a circular dependency");
					var arr = circularDependencyPrevention.stream().distinct().toArray(String[]::new);
					CompilerLogger.error("circular dependency in modules " + Arrays.toString(arr), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
				} else {
					var mod = Main.parse(Objects.requireNonNull(ImportManager.getPathOfModule(x)));
					builder.importModule(mod, currentScope);
				}
			}
		}
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof SemanticAnalyzer that)) return false;
		return new EqualsBuilder().append(currentScope, that.currentScope).append(result, that.result).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 41).append(currentScope).append(result).toHashCode();
	}

}