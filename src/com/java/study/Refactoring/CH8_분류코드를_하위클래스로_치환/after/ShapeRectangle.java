package com.java.study.Refactoring.CH8_분류코드를_하위클래스로_치환.after;

public class ShapeRectangle extends Shape {
	protected ShapeRectangle(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}

	private void drawRectangle() {
		System.out.println("drawRectangle:" + this.toString());
	}
}
