package net.liquidlang.compiler;

import lombok.Getter;
import lombok.SneakyThrows;
import net.liquidlang.compiler.ast.FLexer;
import net.liquidlang.compiler.ast.FParser;
import net.liquidlang.compiler.err.LiquidErrorHandler;
import net.liquidlang.compiler.model.Module;
import net.liquidlang.compiler.semantics.SemanticAnalyzer;
import net.liquidlang.compiler.util.CompilerLogger;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.fusesource.jansi.AnsiConsole;
import org.jetbrains.annotations.NotNull;
import picocli.CommandLine;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static picocli.CommandLine.*;

@Command(
		name = "liqc",
		description = "LiquidLang Compiler",
		version = "1.0.0",
		mixinStandardHelpOptions = true
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
	@Option(names = {"--verbose", "-v"})
	private static boolean verbose;

	@Getter
	private static boolean compilingLib = false;

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
		var stp = new StopWatch();
		stp.start();
		parse(mainTarget);
		stp.stop();
		if(ansi) AnsiConsole.systemUninstall();
		Thread.sleep(200);
		if(LiquidErrorHandler.errors >= 1) CompilerLogger.terminate(LiquidErrorHandler.errors + " errors found" + (LiquidErrorHandler.warns >= 1 ? " with " + LiquidErrorHandler.warns + " warns" : "") + " in " + stp.getTime(TimeUnit.MILLISECONDS) + "ms"); else CompilerLogger.info("compiled " + targets.size() + " modules successfully" + (LiquidErrorHandler.warns >= 1 ? " with " + LiquidErrorHandler.warns + " warnings" : "") + " in " + stp.getTime(TimeUnit.MILLISECONDS) + "ms");
		return 0;
	}

	@SneakyThrows
	public static Module parse(@NotNull Path origin) {
		CompilerLogger.debug("parsing module from path " + origin);
		FLexer lex = new FLexer(CharStreams.fromPath(origin));
		CompilerLogger.debug("lexer created");
		lex.removeErrorListeners();
		lex.addErrorListener(LiquidErrorHandler.INSTANCE);
		CompilerLogger.debug("configured lexer error handling");
		var parser = new FParser(new CommonTokenStream(lex));
		CompilerLogger.debug("parser created");
		parser.removeErrorListeners();
		parser.addErrorListener(LiquidErrorHandler.INSTANCE);
		CompilerLogger.debug("configured parser error handling");
		var sem = new SemanticAnalyzer(StringUtils.removeEnd(origin.getFileName().toString(), ".lq"));
		new ParseTreeWalker().walk(sem, parser.compilationUnit());
		var mod = sem.getResult();
		CompilerLogger.debug("produced module object containing " + mod.getFunctions().size() + " exported functions");
		return mod;
	}

}
