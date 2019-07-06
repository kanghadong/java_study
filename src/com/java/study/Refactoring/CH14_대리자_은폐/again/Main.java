package com.java.study.Refactoring.CH14_대리자_은폐.again;

import java.io.IOException;
import java.util.Enumeration;

public class Main {
	public static void main(String[] args) {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.set("Hiroshi Yuki", "hyuki@example.com");
			file.set("Tomura", "tomura@example.com");
			file.set("Hanko Sato", "hanako@example.com");
			file.update();

			Enumeration e = file.names();

			while(e.hasMoreElements()) {
				String name = (String)e.nextElement();
				String mail = file.get(name);
				System.out.println("name=" + name + ", mail=" + mail);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
