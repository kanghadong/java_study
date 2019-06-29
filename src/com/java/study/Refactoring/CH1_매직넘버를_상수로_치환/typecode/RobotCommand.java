package com.java.study.Refactoring.CH1_매직넘버를_상수로_치환.typecode;

public class RobotCommand {
	private final String _name;

	public RobotCommand(String name) {
		_name = name;
	}

	public String toString() {
		return "[RobotCommand]:" + _name + "]";
	}
}
