package tests.liquidlang;

import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.util.SymbolUtils;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class FunctionTests {

	@Test
	public void test_name_mangling() {
		System.out.println("Testing name mangling of functions in arbitrary file 'func.lq'\n");
		System.out.println("ORIGINAL  : func hello() -> i32");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i32", "hello", 0) + "\n");
		System.out.println("ORIGINAL  : func hello(i32) -> i32");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i32", "hello", 1) + "\n");
		System.out.println("ORIGINAL  : func hellos() -> i64");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i64", "hellos", 0) + "\n");
	}

	@Test
	public void test_func_parsing() {
		Main.parse(Paths.get("src/test/resources/main.lq"));
	}

}