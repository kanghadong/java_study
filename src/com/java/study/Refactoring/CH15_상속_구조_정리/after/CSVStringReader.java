package com.java.study.Refactoring.CH15_상속_구조_정리.after;

import java.io.BufferedReader;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {
	public CSVStringReader(String string) {
		super(new BufferedReader(new StringReader(string)));
	}

}
