package net.fluidlang.compiler.err;

import net.fluidlang.compiler.ast.FParser;
import net.fluidlang.compiler.ast.FParserBaseListener;
import net.fluidlang.compiler.util.SymbolUtils;
import org.antlr.v4.runtime.RuleContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static net.fluidlang.compiler.util.CompilerLogger.*;

/**
 * Validates syntax and assignment.
 */
public class SemanticAnalyzer extends FParserBaseListener {

	private boolean hasDuplicateRuleContext(List<? extends RuleContext> listContainingDuplicates) {
		Set<String> set1 = new HashSet<>();
		for(RuleContext obj : listContainingDuplicates) {
			if(!set1.add(obj.getText())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void enterFunction(FParser.FunctionContext ctx) {
		// firstly, check for duplicate modifiers
		if(hasDuplicateRuleContext(ctx.func_modifiers())) {
			error("duplicate modifiers in function: " + SymbolUtils.functionToString(ctx) + "");
			LiquidErrorHandler.errors++;
		}
	}
}