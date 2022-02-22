package net.fluidlang.compiler;

import lombok.SneakyThrows;
import net.fluidlang.compiler.ast.FLexer;
import net.fluidlang.compiler.ast.FParser;
import net.fluidlang.compiler.ast.FParserBaseListener;
import net.fluidlang.compiler.err.LiquidErrorHandler;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.VisibleForTesting;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.concurrent.Callable;

import static picocli.CommandLine.*;

@Command(
		name = "liqc",
		description = "LiquidLang Compiler",
		version = "1.0.0"
)
public class Main implements Callable<Integer> {

	private Main() {}

	@Parameters
	private static Set<Path> targets;

	public static void main(String[] args) {
		System.exit(new CommandLine(new Main()).execute(args));
	}

	@Override
	@SneakyThrows
	public Integer call() {
		boolean has_good_file = false;
		Path mainTarget = null;
		for(Path p : targets) {
			if(!p.getFileName().toString().endsWith(".lq")) {
				System.err.println("liqc: files must end with the .lq extension");
				System.err.println("liqc: compilation terminated");
			}
			if(p.getFileName().toString().equals("main.lq") || p.getFileName().toString().equals("lib.lq")) {
				if(has_good_file) {
					System.err.println("liqc: main.lq and lib.lq exist; there can only be one of them");
					System.err.println("liqc: compilation terminated");
				}
				has_good_file = true;
				mainTarget = p;
			}
		}
		if(!has_good_file) {
			System.err.println("liqc: no main.lq or lib.lq present");
			System.err.println("liqc: compilation terminated");
		}

		assert mainTarget != null;
		return parse(mainTarget);
	}

	@SneakyThrows
	@VisibleForTesting
	public static int parse(@NotNull Path origin) {
		var lex = new FLexer(CharStreams.fromPath(origin));
		lex.removeErrorListeners();
		lex.addErrorListener(LiquidErrorHandler.INSTANCE);
		var parser = new FParser(new CommonTokenStream(lex));
		parser.removeErrorListeners();
		parser.addErrorListener(LiquidErrorHandler.INSTANCE);
		new ParseTreeWalker().walk(new TestWalker(),parser.compilationUnit());
		if(!LiquidErrorHandler.INSTANCE.getErrors().isEmpty()) {
			for(String s : LiquidErrorHandler.INSTANCE.getErrors()) {
				System.err.println(s + "\n");
			}
			return 1;
		}
		return 0;
	}

	private static final class TestWalker extends FParserBaseListener {

		@Override
		public void enterFunction(FParser.FunctionContext ctx) {
			System.out.println("(FUNC) Entered function '" + ctx.IDENTIFIER() + "' with return type '" + (ctx.type() != null ? ctx.type().getText() : "()") + "'");
		}

		@Override
		public void enterFormalParameter(FParser.FormalParameterContext ctx) {
			System.out.println("(FUNC) Entered formal parameter " + ctx.getText());
		}

		@Override
		public void enterImportStatement(FParser.ImportStatementContext ctx) {
			System.out.println("(BASE) Entered import statement to import " + ctx.IDENTIFIER().getText());
		}

		@Override
		public void enterValue(FParser.ValueContext ctx) {
			System.out.println("Value entered: " + ctx.getText());
		}
	}

}
