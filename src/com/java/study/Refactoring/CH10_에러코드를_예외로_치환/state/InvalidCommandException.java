package com.java.study.Refactoring.CH10_에러코드를_예외로_치환.state;

public class InvalidCommandException extends Exception{
	public InvalidCommandException(String name) {
		super(name);
	}

	public InvalidCommandException() {

	}
}
