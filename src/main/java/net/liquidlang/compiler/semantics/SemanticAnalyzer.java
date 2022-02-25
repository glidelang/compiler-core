package net.liquidlang.compiler.semantics;

import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.util.SymbolUtils;
import net.liquidlang.compiler.ast.*;
import org.antlr.v4.runtime.RuleContext;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static net.liquidlang.compiler.util.CompilerLogger.*;

/**
 * Validates syntax and assignment.
 */
public class SemanticAnalyzer extends FParserBaseListener {

	private Scope currentScope = null;

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
			error("cannot declare a variable with the same name: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
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
}