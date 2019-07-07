package com.java.study.Refactoring.CH15_상속_구조_정리.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {
	public CSVFileReader(String filename) throws IOException {
		super(new BufferedReader(new FileReader(filename)));
	}
}
