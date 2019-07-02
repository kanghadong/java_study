package com.java.study.Refactoring.CH11_생성자를_팩토리_메소드로_치환.after;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;

	private final int _typecode;
	private final int _startx;
	private final int _statry;
	private final int _endx;
	private final int _endy;

	public static Shape create(int typecode, int startx, int starty, int endx, int endy) {
		return new Shape(typecode, startx, starty, endx, endy);
	}

	private Shape(int typecode, int startx, int starty, int endx, int endy) {
		_typecode = typecode;
		_startx = startx;
		_statry = starty;
		_endx = endx;
		_endy = endy;
	}

	public int getTypecode() {
		return _typecode;
	}

	public String getName() {
		switch(_typecode) {
			case TYPECODE_LINE:
				return "Line";
			case TYPECODE_RECTANGLE:
				return "Rectangle";
			case TYPECODE_OVAL:
				return "Oval";
			default:
				return null;
		}
	}

	public String toString() {
		return "["
			+ getName() + ","
			+ "(" + _startx + "," + _statry + ")-"
			+ "(" + _endx + "," + _endy + ")]";
	}

	public void draw() {
		switch(_typecode) {
			case TYPECODE_LINE:
				drawLine();
				break;
			case TYPECODE_RECTANGLE:
				drawRectangle();
				break;
			case TYPECODE_OVAL:
				drawOval();
				break;
			default:
				break;
		}
	}

	private void drawLine() {
		System.out.println("drawLine:" + this.toString());
	}

	private void drawRectangle() {
		System.out.println("drawRectangle:" + this.toString());
	}

	private void drawOval() {
		System.out.println("drawOval:" + this.toString());
	}
}
