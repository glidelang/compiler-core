package net.fluidlang.compiler.util;

import net.fluidlang.compiler.Main;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;

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
			stderr.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.RED).bold().a("error: ").reset().a(s + "\nat " + Paths.get(file).toAbsolutePath().toString().replace(File.separator, "/") + " " + line + ":" + col + ")\n").reset().toString());
		} else {
			stderr.println("liqc: error: " + s);
		}
	}
	public static void warn(String s) {
		if(Main.isAnsi()) {
			stderr.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.YELLOW).bold().a("warning: ").reset().a(s).reset().toString());
		} else {
			stderr.println("liqc: warning: " + s);
		}
	}

	public static void info(String s) {
		if(Main.isAnsi()) {
			stdout.println(Ansi.ansi().fg(Ansi.Color.WHITE).a("liqc: ").fg(Ansi.Color.GREEN).bold().a("info: ").reset().a(s).reset().toString());
		} else {
			stdout.println("liqc: info: " + s);
		}
	}

	public static void terminate(String s) {
		error(s);
		stderr.println("compilation terminated.");
		System.exit(1);
	}

}
