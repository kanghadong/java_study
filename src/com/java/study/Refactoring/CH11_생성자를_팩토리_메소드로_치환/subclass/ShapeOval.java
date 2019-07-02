package com.java.study.Refactoring.CH11_생성자를_팩토리_메소드로_치환.subclass;

public class ShapeOval extends Shape{
	public ShapeOval(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		return "OVAL";
	}

	@Override
	public void draw() {
		System.out.println("drawOval:" + this.toString());
	}
}
