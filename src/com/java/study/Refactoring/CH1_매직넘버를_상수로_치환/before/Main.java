package com.java.study.Refactoring.CH1_매직넘버를_상수로_치환.before;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		robot.order(0);
		robot.order(1);
		robot.order(2);
	}
}
