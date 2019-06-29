package com.java.study.Refactoring.CH4_Null객체_도입.after;

public class NullLabel extends Label {
	public NullLabel() {
		super("(none)");
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public void display() {}
}
