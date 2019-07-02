package com.java.study.Refactoring.CH11_생성자를_팩토리_메소드로_치환.subclass;

public abstract class Shape {
	private final int _startx;
	private final int _statry;
	private final int _endx;
	private final int _endy;

	public static Shape createLine(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}

	public static Shape createRectangle(int startx, int starty, int endx, int endy) {
		return new ShapeRectangle(startx, starty, endx, endy);
	}

	public static Shape createOval(int startx, int starty, int endx, int endy) {
		return new ShapeOval(startx, starty, endx, endy);
	}

	protected Shape(int startx, int starty, int endx, int endy) {
		_startx = startx;
		_statry = starty;
		_endx = endx;
		_endy = endy;
	}

	public String toString() {
		return "["
			+ getName() + ","
			+ "(" + _startx + "," + _statry + ")-"
			+ "(" + _endx + "," + _endy + ")]";
	}

	public abstract String getName();
	public abstract void draw();
}
