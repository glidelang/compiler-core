package net.liquidlang.compiler.semantics;

import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.util.CompilerLogger;
import net.liquidlang.compiler.util.SymbolUtils;
import net.liquidlang.compiler.ast.*;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;
import java.util.*;

import static net.liquidlang.compiler.util.CompilerLogger.*;

/**
 * Validates syntax and assignment.
 */
public class SemanticAnalyzer extends FParserBaseListener {

	private Scope currentScope = null;
	private static final List<String> circularDependencyPrevention = new ArrayList<>();

	private boolean hasDuplicateRuleContext(@NotNull List<? extends RuleContext> listContainingDuplicates) {
		Set<String> set1 = new HashSet<>();
		for(RuleContext obj : listContainingDuplicates) {
			if(!set1.add(obj.getText())) {
				return true;
			}
		}
		return false;
	}

	// ================================================================================== init-scope (module)

	@Override
	public void enterCompilationUnit(@NotNull FParser.CompilationUnitContext ctx) {
		currentScope = Scope.from_module(ctx);
	}

	@Override
	public void exitCompilationUnit(FParser.CompilationUnitContext ctx) {
		currentScope = null;
	}

	// ================================================================================== destroy-scope (module)

	// ================================================================================== init-scope (blocks)

	@Override
	public void enterFunction(@NotNull FParser.FunctionContext ctx) {

		// check for duplicate modifiers
		if(hasDuplicateRuleContext(ctx.func_modifiers())) {
			error("duplicate modifiers in function: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		}

		// check if the function returns a value
		if(ctx.type() != null) {
			if(ctx.block().body().returnStatement() == null) {
				error("missing return statement in function: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			}
		}

	}

	@Override public void enterBody(FParser.BodyContext ctx) { currentScope = currentScope.child(); }
	@Override public void exitBody(FParser.BodyContext ctx) { currentScope = currentScope.parent(); }

	// ================================================================================== destroy-scope (body)

	@Override
	public void enterMethodCall(@NotNull FParser.MethodCallContext ctx) {

		// check symbol table for function
		if(currentScope.resolve_function(ctx.IDENTIFIER().getText()) == null) {
			error("unknown function: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		}

	}

	@Override
	public void enterAssignment(FParser.AssignmentContext ctx) {

		// check for existing variable in current scope
		if(currentScope.variableMap.containsKey(ctx.IDENTIFIER().getText())) {
			error("cannot declare a variable with the same name: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {
			// add to the current scope
			currentScope.variableMap.put(ctx.IDENTIFIER().getText(), LiquidType.fromAssignmentContext(ctx));
		}

	}

	// we do not need to keep track of assignments as we are not writing a runtime
	@Override
	public void enterReassignment(FParser.ReassignmentContext ctx) {

		// check symbol table for variable
		if(currentScope.resolve_variable(ctx.IDENTIFIER().getText()) == null) {
			error("unknown variable: " + ctx.IDENTIFIER(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
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
		if(ImportManager.isLocalImport(ctx)) {
			var x = ctx.IDENTIFIER().get(ctx.IDENTIFIER().size() - 1).getText();
			if(!ImportManager.isContainedLocally(x)){
				error("unknown local module: " + x, ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				circularDependencyPrevention.add("'" + StringUtils.removeEnd(Paths.get(ctx.start.getTokenSource().getSourceName()).getFileName().toString(), ".lq") + "'");
				if(!findDuplicates(circularDependencyPrevention).isEmpty()) {
					var arr = circularDependencyPrevention.stream().distinct().toArray(String[]::new);
					CompilerLogger.error("circular dependency in modules " + Arrays.toString(arr), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
				} else {
					Main.parse(Objects.requireNonNull(ImportManager.getPathOfModule(x)));
				}
			}
		}
	}
}