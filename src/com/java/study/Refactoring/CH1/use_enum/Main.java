package com.java.study.Refactoring.CH1.use_enum;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot("Andrew");
		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
	}
}
