package com.java.study.Refactoring.CH10_에러코드를_예외로_치환.after;

public class Position {
	public int _x;
	public int _y;

	public Position(int x, int y) {
		_x = x;
		_y = y;
	}

	public void relativeMove(int dx, int dy) {
		_x += dx;
		_y += dy;
	}
}
