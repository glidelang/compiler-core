package net.liquidlang.compiler.semantics;

import net.liquidlang.compiler.Main;
import net.liquidlang.compiler.ast.FParser;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * Manages imports from a multi-module project.
 */
public final class ImportManager {

	private static final Set<String> mods = new HashSet<>();

	static {
		for(Path p : Main.getTargets()) {
			mods.add(StringUtils.removeEnd(p.getFileName().toString(), ".lq"));
		}
	}

	public static boolean isLocalImport(FParser.@NotNull ImportStatementContext context) {
		return context.MODULE() != null;
	}

	public static boolean isContainedLocally(String identifier) {
		return mods.contains(identifier);
	}

	public static @Nullable Path getPathOfModule(String name) {
		for(Path p : Main.getTargets()) {
			if(p.getFileName().toString().equals(name + ".lq")) return p;
		}
		return null;
	}

}
