package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.리스코프치환원칙.원칙적용.변경사항_반영후;

public abstract class AbstractOperation {
	public abstract int operate(int firstNumber, int secondNumber);

	public boolean isInvalidNumber(int firstNumber, int secondNumber) {
		return false;
	}
}
