package tests.fluidlang;

import net.fluidlang.compiler.ast.FLexer;
import net.fluidlang.compiler.ast.FParser;
import net.fluidlang.compiler.ast.FParserBaseListener;
import net.fluidlang.compiler.util.FFIUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class FunctionTests {

	@Test
	public void test_name_mangling() {
		System.out.println("Testing name mangling of functions in arbitrary file 'func.lq'\n");
		System.out.println("ORIGINAL  : func hello() -> i32");
		System.out.println("LQ_MANGLED: " + FFIUtils.mangle_function("func.lq", "i32", "hello", 0) + "\n");
		System.out.println("ORIGINAL  : func hello(i32) -> i32");
		System.out.println("LQ_MANGLED: " + FFIUtils.mangle_function("func.lq", "i32", "hello", 1) + "\n");
		System.out.println("ORIGINAL  : func hello() -> i64");
		System.out.println("LQ_MANGLED: " + FFIUtils.mangle_function("func.lq", "i64", "hello", 0) + "\n");
	}

	@Test
	public void test_func_parsing() throws IOException {
		var lex = new FLexer(CharStreams.fromPath(Paths.get("src/test/resources/test.lq")));
		var parser = new FParser(new CommonTokenStream(lex));
		new ParseTreeWalker().walk(new TestWalker(),parser.compilationUnit());
	}

	private static final class TestWalker extends FParserBaseListener {

		@Override
		public void enterCompilationUnit(FParser.CompilationUnitContext ctx) {
			System.out.println("(BASE) Entered compilation unit with function count " + ctx.function().size());
		}

		@Override
		public void enterFunction(FParser.FunctionContext ctx) {
			System.out.println("(FUNC) Entered function '" + ctx.IDENTIFIER() + "' with return type '" + (ctx.type() != null ? ctx.type().getText() : "()") + "'");
		}

		@Override
		public void enterFormalParameter(FParser.FormalParameterContext ctx) {
			System.out.println("(FUNC) Entered formal parameter " + ctx.getText());
		}

	}

}
