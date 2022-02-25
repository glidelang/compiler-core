package net.liquidlang.compiler;

import lombok.Getter;
import lombok.SneakyThrows;
import net.liquidlang.compiler.ast.FLexer;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.semantics.SemanticAnalyzer;
import net.liquidlang.compiler.util.CompilerLogger;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fusesource.jansi.AnsiConsole;
import org.jetbrains.annotations.NotNull;
import picocli.CommandLine;

import java.nio.file.Files;
import java.nio.file.Path;
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

	@Getter
	@Parameters
	private static Set<Path> targets;

	@Getter
	@Option(names = {"--ansi-color", "-c"})
	private static boolean ansi;

	@Getter
	@Option(names = {"--verbose", "-V"})
	private static boolean verbose;

	public static void main(String[] args) {
		System.exit(new CommandLine(new Main()).execute(args));
	}

	@Override
	@SneakyThrows
	public Integer call() {
		if(targets == null) {
			CompilerLogger.terminate("no input files");
			return 1;
		}
		boolean hasOrigin = false;
		boolean compilingLib = false;
		Path mainTarget = null;
		for(Path p : targets) {
			if(Files.notExists(p)) {
				CompilerLogger.terminate(String.format("file not found: %s", p));
			}
			if(!p.getFileName().toString().endsWith(".lq")) {
				CompilerLogger.terminate("files must end with the .lq extension");
			}
			if(p.getFileName().toString().equals("main.lq") || p.getFileName().toString().equals("lib.lq")) {
				if(!compilingLib && p.getFileName().toString().equals("lib.lq")) compilingLib = true;
				if(hasOrigin) {
					CompilerLogger.terminate("main.lq and lib.lq exist; there can only be one of them");
				}
				hasOrigin = true;
				mainTarget = p;
			}
		}
		if(!hasOrigin) {
			CompilerLogger.terminate("no origin file main.lq or lib.lq present");
			return 1;
		}

		CompilerLogger.info("compiling library from " + targets.size() + " modules");

		parse(mainTarget);
		if(ansi) AnsiConsole.systemUninstall();
		if(LiquidErrorHandler.errors >= 1) CompilerLogger.terminate(LiquidErrorHandler.errors + " errors found");
		return 0;
	}

	@SneakyThrows
	public static void parse(@NotNull Path origin) {
		FLexer lex = new FLexer(CharStreams.fromPath(origin));
		lex.removeErrorListeners();
		lex.addErrorListener(LiquidErrorHandler.INSTANCE);
		var parser = new FParser(new CommonTokenStream(lex));
		parser.removeErrorListeners();
		parser.addErrorListener(LiquidErrorHandler.INSTANCE);
		new ParseTreeWalker().walk(new SemanticAnalyzer(), parser.compilationUnit());
	}

}
