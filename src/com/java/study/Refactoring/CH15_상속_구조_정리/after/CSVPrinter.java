package com.java.study.Refactoring.CH15_상속_구조_정리.after;

import java.io.IOException;

public abstract class CSVPrinter {
	protected final CSVReader _csvReader;

	protected CSVPrinter(CSVReader csvReader) {
		_csvReader = csvReader;
	}

	public abstract void print() throws IOException;
}
