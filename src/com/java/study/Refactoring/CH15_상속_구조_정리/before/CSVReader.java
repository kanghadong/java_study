package com.java.study.Refactoring.CH15_상속_구조_정리.before;

import java.io.IOException;
import java.util.regex.Pattern;

public abstract class CSVReader {
	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
	public abstract String[] readCSV() throws IOException;
	public abstract void close() throws IOException;
}
