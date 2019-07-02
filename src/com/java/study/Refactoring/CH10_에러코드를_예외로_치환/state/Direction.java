package com.java.study.Refactoring.CH10_에러코드를_예외로_치환.state;

public class Direction {
	public int _x;
	public int _y;

	public Direction(int x, int y) {
		_x = x;
		_y = y;
	}

	public void setDirection(int x, int y) {
		_x = x;
		_y = y;
	}

}
