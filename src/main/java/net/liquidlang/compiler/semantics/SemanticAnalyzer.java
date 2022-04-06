package net.liquidlang.compiler.semantics;

import lombok.Getter;
import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.ast.FParserBaseListener;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.model.Module;
import net.liquidlang.compiler.model.*;
import net.liquidlang.compiler.util.Modules;
import net.liquidlang.compiler.util.SymbolUtils;
import org.antlr.v4.runtime.RuleContext;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.time.StopWatch;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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
	private static final List<String> modulesParsed = new ArrayList<>();
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

	public static FParser.@Nullable ReturnStatementContext getReturns(FParser.@NotNull BodyContext context) {

		var list = new ArrayList<FParser.ReturnStatementContext>();
		boolean hasReturn = false;
		boolean hasWarned = false;
		for(var v : context.stmt()) {
			if(v.returnStatement() != null) {
				if(!hasReturn) {
					list.add(v.returnStatement());
					hasReturn = true;
				} else {
					warn("unreachable return", v.getStart().getLine(), v.getStart().getCharPositionInLine(), v.start.getTokenSource().getSourceName());
				}
			} else if(!hasWarned && hasReturn) {
				warn("unreachable statement", v.getStart().getLine(), v.getStart().getCharPositionInLine(), v.start.getTokenSource().getSourceName());
				hasWarned = true;
			}
		}
		return !list.isEmpty() ? list.get(0) : null;

	}

//	/**
//	 * Verifies whether all control flow routes lead to returns.
//	 * @param context the context to check
//	 * @return whether there are returns
//	 */
//	public static boolean verifyReturnsExistInBlock(FParser.@NotNull BodyContext context) {
//
//		// just do a few premature checks first
//		if(context.stmt().isEmpty()) {
//			return false;
//		} else if(getReturns(context) != null) {
//			return true;
//		}
//
//		for(var s : context.stmt()) {
//
//		}
//		return true;
//
//	}

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
			if(getReturns(ctx.block().body()) == null) {
				error("missing return statement in function: " + SymbolUtils.functionToString(ctx) + "", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				debug("checking type of return value");
				SymbolUtils.checkReturnStatements(ctx.block().body().stmt(), ObjectType.fromTypeContext(ctx.functionSignature().type()), currentScope, ctx);
			}
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

		// we can guarantee that the type will only be null if a return type is specified
		// through the function call: e.g. function->void(); will never be null
		ObjectType type = ctx.type() != null ? ObjectType.fromTypeContext(ctx.type()) : null;

		FunctionDescriptor fun = null;
		if(ctx.valuedMethodCall() != null) {
			var infer = SymbolUtils.typeCheckAndInference(ctx.valuedMethodCall().valueExpr(), ctx, currentScope);
			if(infer == null) {
				return;
			} else if(infer.getDescriptor() == null) {
				debug("unable to resolve function from value expression: actual type is " + infer);
				error("unknown function: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				fun = infer.getDescriptor();
			}
		} else {
			fun = FunctionDescriptor.from(currentScope.resolve_function(FunctionDescriptor.from(name, ctx.IDENTIFIER().getText(), type, null, ctx.passedParameterList().valueExpr().stream().map(valueContext -> SymbolUtils.typeCheckAndInference(valueContext, ctx, currentScope)).toArray(ObjectType[]::new))));
			if(fun == null) {
				// function might be in a different module
				for(Module module : builder.getImportedModules()) {
					if(fun == null) {
						fun = FunctionDescriptor.from(currentScope.resolve_function(FunctionDescriptor.from(module.getName(), ctx.IDENTIFIER().getText(), type, null, ctx.passedParameterList().valueExpr().stream().map(valueContext -> SymbolUtils.typeCheckAndInference(valueContext, ctx, currentScope)).toArray(ObjectType[]::new))));
					} else {
						break;
					}
				}
				if(fun == null) {
					debug("unable to resolve function in scope " + Integer.toHexString(currentScope.hashCode()));
					error("unknown function: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					LiquidErrorHandler.errors++;
					return;
				}
			}
		}

		debug("resolved function call '" + ctx.getText() + "' as " + fun);
		if(Objects.requireNonNull(fun).getModifiers().stream().map(RuleContext::getText).collect(Collectors.joining()).contains("unsafe")) {
			debug("function call '" + fun + "' is unsafe");
			debug("checking if it is in an unsafe block");
			if(SymbolUtils.getNearestParentOfContext(ctx.parent, FParser.UnsafeBlockContext.class) == null) {
				debug("unsafe block requirement not fulfilled");
				error("unsafe function must be in unsafe block: " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				debug("unsafe block requirement fulfilled");
			}
		}
		var formalList = fun.getParameterTypes();
		List<ObjectType> passedList = ctx.passedParameterList() != null ? ctx.passedParameterList().valueExpr().stream().map(c -> SymbolUtils.typeCheckAndInference(c, ctx, currentScope)).toList() : Collections.emptyList();
		debug("verifying function signature correspondence");
		if(formalList.size() != passedList.size()) {
			debug("differing parameter count; reporting error");
			error("formal parameter list " + formalList + " does not match with actual parameters passed " + passedList + ": " + ctx.getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {
			debug("type checking parameters");
			for(int i = 0; i < formalList.size(); i++) {
				ObjectType formal = formalList.get(i);
				ObjectType passed = passedList.get(i);
				debug("index " + i + ": (formal) " + formal + " vs (passed) " + passed);
				if(formal != passed) {
					if(formal.isNullable() && passed == ObjectType.VOID) {
						debug("requirement fulfilled; nullable type and void value");
					} else {
						error("incompatible types: " + ctx.passedParameterList().valueExpr(i).getText() + " of type '" + formal + "' differs from type '" + passed + "' expected in '" + formalList + "'", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
						LiquidErrorHandler.errors++;
					}
				}
			}
		}

	}

	@Override
	public void enterAssignment(FParser.AssignmentContext ctx) {

		debug("entered assignment statement");

		// check for existing variable in current scope
		if(currentScope.resolve_variable(VariableDescriptor.wildcard_from(ctx.IDENTIFIER().getText(), currentScope.hashCode())) != null) {
			debug("variable declared more than once in scope " + Integer.toHexString(currentScope.hashCode()));
			error("cannot declare a variable with the same name: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {
			// add to the current scope
			ObjectType obj = ObjectType.fromAssignmentContext(ctx, currentScope);
			currentScope.variableMap.put(VariableDescriptor.from(ctx.IDENTIFIER().getText(), currentScope.hashCode(), ObjectType.fromAssignmentContext(ctx, currentScope), ctx.variable_modifiers()), obj);
			if(ctx.type() != null) {

				var eval = SymbolUtils.typeCheckAndInference(ctx.valueExpr(), ctx, currentScope);

				debug("type checking value '" + ctx.valueExpr().getText() + "' with type " + obj.toString());
				if(obj.isNullable() && eval == ObjectType.VOID) {
					debug("given a nullable variable a null initializer; returning");
					return;
				} else if(obj.isNullable() && eval != ObjectType.VOID) {
					debug("given a nullable variable a full value; performing type checking");
				} else if(!obj.isNullable() && eval == ObjectType.VOID) {
					debug("given a full variable a null initializer; returning with error");
					if(ctx.valueExpr().methodCall() != null) {
						error("cannot assign a void function to a variable expecting a full type: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					} else {
						error("cannot assign a null initializer to a variable expecting a full type: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
					}
					LiquidErrorHandler.errors++;
					return;
				} else {
					debug("given a full variable a full value; performing type checking");
				}

				if(obj != eval && !obj.isNullable()) {
					debug("incompatible types in full variable");
					error("incompatible types: " + ctx.valueExpr().getText() + " of type '" + eval + "' differs from type '" + obj + "'", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				} else if(obj != eval && eval != ObjectType.VOID) {
					debug("incompatible types in nullable variable");
					error("incompatible types: " + ctx.valueExpr().getText() + " of type '" + eval + "' differs from type '" + obj + "'", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				}

			}
		}

	}

	// we do not need to keep track of assignments as we are not writing a runtime
	@Override
	public void enterReassignment(FParser.ReassignmentContext ctx) {

		// check symbol table for variable
		debug("entered reassignment statement");
		ObjectType obj = currentScope.resolve_variable(VariableDescriptor.wildcard_from(ctx.IDENTIFIER().getText(), currentScope.hashCode()));
		VariableDescriptor id = currentScope.resolve_variable_descriptor(VariableDescriptor.wildcard_from(ctx.IDENTIFIER().getText(), currentScope.hashCode()));
		if(obj == null || id == null) {
			debug("cannot find variable in scope " + Integer.toHexString(currentScope.hashCode()));
			error("unknown variable: " + ctx.IDENTIFIER(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else if(!id.isMutable()) {
			error("cannot mutate non-mutable variable: " + ctx.IDENTIFIER(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			LiquidErrorHandler.errors++;
		} else {

			var eval = SymbolUtils.typeCheckAndInference(ctx.valueExpr(), ctx, currentScope);

			debug("type checking value '" + ctx.valueExpr().getText() + "' with type " + obj);
			if(obj.isNullable() && eval == ObjectType.VOID) {
				debug("given a nullable variable a null initializer; returning");
				return;
			} else if(obj.isNullable() && eval != ObjectType.VOID) {
				debug("given a nullable variable a full value; performing type checking");
			} else if(!obj.isNullable() && eval == ObjectType.VOID) {
				debug("given a full variable a null initializer; returning with error");
				if(ctx.valueExpr().methodCall() != null) {
					error("cannot assign a void function to a variable expecting a full type: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				} else {
					error("cannot assign a null initializer to a variable expecting a full type: " + ctx.IDENTIFIER().getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				}
				LiquidErrorHandler.errors++;
				return;
			} else {
				debug("given a full variable a full value; performing type checking");
			}

			if(obj != eval && !obj.isNullable()) {
				debug("incompatible types in full variable");
				error("incompatible types: " + ctx.valueExpr().getText() + " of type '" + eval + "' differs from type '" + obj + "'", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			} else if(obj != eval && eval != ObjectType.VOID) {
				debug("incompatible types in nullable variable");
				error("incompatible types: " + ctx.valueExpr().getText() + " of type '" + eval + "' differs from type '" + obj + "'", ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
			}
		}

	}

	@SuppressWarnings("all")
	private <T> boolean findDuplicatePattern(@NotNull List<T> collection) {
		List<T[]> pattern = new ArrayList<>();
		for(int i = 0; i + 1 < collection.size(); i++) {
			pattern.add((T[]) new Object[] { collection.get(i), collection.get(i + 1) });
		}
		List<T[]> collection2 = new ArrayList<>();
		for(int i = 0; i + 1 < collection.size(); i++) {
			// group the collection into arrays
			collection2.add((T[]) new Object[] { collection.get(i), collection.get(i + 1) });
		}
		boolean repeat = false;
		boolean duplicate = false;
		for(T[] tArray : collection2) {
			for(T[] tArray2 : pattern) {
				if(Arrays.equals(tArray, tArray2)) {
					if(repeat) {
						duplicate = true;
						break;

					} else {
						repeat = true;
					}
				}
			}
		}
		return duplicate;
	}

	@Override
	public void enterImportStatement(FParser.ImportStatementContext ctx) {
		debug("entered import statement");
		if(Modules.isLocalImport(ctx)) {
			var x = ctx.IDENTIFIER().get(ctx.IDENTIFIER().size() - 1).getText();
			if(!Modules.isContainedLocally(x)){
				debug("cannot find module in compilation target files");
				error("unknown local module: " + x, ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.start.getTokenSource().getSourceName());
				LiquidErrorHandler.errors++;
			} else {
				debug("adding module name to module access order list");
				modulesParsed.add("'" + x + "'");
				if(!findDuplicatePattern(modulesParsed)) {
					var mod = Main.parse(Objects.requireNonNull(Modules.getPathOfModule(x)));
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