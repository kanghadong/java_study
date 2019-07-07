package com.java.study.Refactoring.CH15_상속_구조_정리.before;

import java.io.IOException;

public class Main {
	private static final String SAMPLE_CSV_STRING =
		"좋은 아침입니다.,Good morning\n"
		+ "안녕하세요~,Hello.\n"
		+ "안녕하세요.,Good evening.\n"
		+ "안녕히 주무세요.,Good night.\n";

	private static final String SAMPLE_CSV_FILE = "/Users/kanghadong/IdeaProjects/java_study/src/com/java/study/Refactoring/CH15_상속_구조_정리/file.csv";

	public static void main(String[] args) throws IOException {
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
	}
}
