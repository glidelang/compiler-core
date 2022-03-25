package net.liquidlang.compiler.util;

import net.liquidlang.compiler.Main;
import org.fusesource.jansi.Ansi;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Set;

public final class CompilerLogger {

	private static final PrintStream stdout;
	private static final PrintStream stderr;

	static {
		stdout = System.out;
		stderr = System.err;
	}

	public static void error(String s) {
		if(Main.isAnsi()) {
			stderr.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.RED).bold().a("error: ").reset().a(s).reset().toString());
		} else {
			stderr.println("liqc: error: " + s);
		}
	}


	public static void error(String s, int line, int col, String file) {
		if(Main.isAnsi()) {
			stderr.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.RED).bold().a("error: ").reset().a(s + "\nat " + Paths.get(file).toAbsolutePath().toString().replace(File.separator, "/") + " " + line + ":" + col + "\n").reset().toString());
		} else {
			stderr.println("liqc: error: " + s + "\nat " + Paths.get(file).toAbsolutePath().toString().replace(File.separator, "/") + " " + line + ":" + col + "\n");
		}
	}

	public static void warn(String s) {
		if(Main.isAnsi()) {
			stdout.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.YELLOW).bold().a("warning: ").reset().a(s).reset().toString());
		} else {
			stdout.println("liqc: warning: " + s);
		}
	}

	public static void warn(String s, int line, int col, String file) {
		if(Main.isAnsi()) {
			stdout.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.YELLOW).bold().a("warning: ").reset().a(s + "\nat " + Paths.get(file).toAbsolutePath().toString().replace(File.separator, "/") + " " + line + ":" + col + "\n").reset().toString());
		} else {
			stdout.println("liqc: warning: " + s + "\nat " + Paths.get(file).toAbsolutePath().toString().replace(File.separator, "/") + " " + line + ":" + col + "\n");
		}
	}

	public static void info(String s) {
		if(Main.isAnsi()) {
			stdout.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.GREEN).bold().a("info: ").reset().a(s).reset().toString());
		} else {
			stdout.println("liqc: info: " + s);
		}
	}

	public static void debug(String s) {
		if(Main.isVerbose()) {
			if(Main.isAnsi()) {
				stdout.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.MAGENTA).bold().a("verbose: ").reset().a(s).reset().toString());
			} else {
				stdout.println("liqc: verbose: " + s);
			}
		}
	}

	public static void terminate(String s) {
		error(s);
		stderr.println("compilation terminated.");
		if(Main.isVerbose()) {
			stdout.println("\n stack trace (" + LocalDateTime.now() + ")");
			var sw = StackWalker.getInstance(Set.of(StackWalker.Option.RETAIN_CLASS_REFERENCE, StackWalker.Option.SHOW_HIDDEN_FRAMES, StackWalker.Option.SHOW_REFLECT_FRAMES), 100);
			sw.forEach(stackFrame -> stdout.println("\t" + stackFrame));
		}
		System.exit(1);
	}

}
