package com.java.study.Refactoring.CH11_생성자를_팩토리_메소드로_치환.subclass;

public class ShapeLine extends Shape {
	public ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		return "LINE";
	}

	@Override
	public void draw() {
		System.out.println("drawLine:" + this.toString());
	}
}
