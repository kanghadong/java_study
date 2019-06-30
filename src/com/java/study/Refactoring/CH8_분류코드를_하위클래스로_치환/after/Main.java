package com.java.study.Refactoring.CH8_분류코드를_하위클래스로_치환.after;

public class Main {
	public static void main(String[] args) {
		Shape line = Shape.createShape(Shape.TYPECODE_LINE, 0,0,100, 200);
		Shape rectangle = Shape.createShape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
		Shape oval = Shape.createShape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

		Shape[] shapes = {
			line, rectangle, oval
		};

		for (Shape s: shapes) {
			s.draw();
		}
	}
}
