package tests.liquidlang;

import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.model.ObjectType;
import net.liquidlang.compiler.util.SymbolUtils;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FunctionTests {

	@Test
	public void test_name_mangling() {
		System.out.println("Testing name mangling of functions in arbitrary file 'func.lq'\n");
		System.out.println("ORIGINAL  : func hello() -> i32");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i32", "hello", Set.of(ObjectType.VOID, ObjectType.FUNC)) + "\n");
		System.out.println("ORIGINAL  : func hello(i32) -> i32");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i32", "hello", Set.of(ObjectType.U8, ObjectType.FUNC)) + "\n");
		System.out.println("ORIGINAL  : func hellos() -> i64");
		System.out.println("LQ_MANGLED: " + SymbolUtils.mangle_function("func.lq", "i64", "hellos", Set.of(ObjectType.BOOL, ObjectType.DROPLET)) + "\n");
	}

	@Test
	public void test_func_parsing() {
		Main.parse(Paths.get("src/test/resources/main.lq"));
	}

}
