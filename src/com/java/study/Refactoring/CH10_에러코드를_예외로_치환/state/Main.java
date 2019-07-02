package com.java.study.Refactoring.CH10_에러코드를_예외로_치환.state;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		System.out.println(robot.toString());

		robot.execute("forward right forward");
		System.out.println(robot.toString());

		robot.execute("left backward left forward");
		System.out.println(robot.toString());

		robot.execute("right forward forward wrong");
		System.out.println(robot.toString());
	}
}
