package com.java.study.Refactoring.CH8_분류코드를_하위클래스로_치환.after;

public class ShapeLine extends Shape {
	protected ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		return "LINE";
	}

	@Override
	public void draw() {
		drawLine();
	}

	private void drawLine() {
		System.out.println("drawLine:" + this.toString());
	}
}
