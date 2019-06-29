package com.java.study.Refactoring.CH2_제어플래그_삭제.SimpleDatabaseBefore;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/kanghadong/IdeaProjects/java_study/src/com/java/study/Refactoring/CH2_제어플래그_삭제/SimpleDatabaseBefore/dbfile.txt");
			SimpleDatabase db = new SimpleDatabase(new FileReader(file));
			Iterator<String> it = db.iterator();

			while(it.hasNext()) {
				String key = it.next();
				System.out.println("KEY:\"" + key + "\"");
				System.out.println("VALUE:\"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
