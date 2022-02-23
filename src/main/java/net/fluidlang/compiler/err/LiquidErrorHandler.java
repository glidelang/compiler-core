package net.fluidlang.compiler.err;

import net.fluidlang.compiler.util.CompilerLogger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class LiquidErrorHandler extends BaseErrorListener {

	public static final LiquidErrorHandler INSTANCE = new LiquidErrorHandler();

	public static int errors = 0;

	private LiquidErrorHandler() {
		//no instance
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
		CompilerLogger.error(msg + "\nat " + recognizer.getInputStream().getSourceName() + " " + line + ":" + charPositionInLine);
		errors++;
	}

}
