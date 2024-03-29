package com.java.study.Refactoring.CH14_대리자_은폐.before;

import java.util.Enumeration;

public class AddressFile {
	private final Database _database;

	public AddressFile(String filename) {
		_database = new Database(filename);
	}

	public Database getDatabase() {
		return _database;
	}

	public Enumeration names() {
		return _database.getProperties().propertyNames();
	}
}
