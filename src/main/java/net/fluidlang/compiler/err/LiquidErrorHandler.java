package net.fluidlang.compiler.err;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiquidErrorHandler extends BaseErrorListener {

	public static final LiquidErrorHandler INSTANCE = new LiquidErrorHandler();
	private static final ArrayList<String> errors = new ArrayList<>();

	private LiquidErrorHandler() {
		//no instance
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
		String builder = "liqc: " + msg + "\nat " + recognizer.getInputStream().getSourceName() + " " + line + ":" + charPositionInLine;
		errors.add(builder);
	}

	public @UnmodifiableView List<String> getErrors() {
		return Collections.unmodifiableList(errors);
	}

}
