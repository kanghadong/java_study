package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.개방폐쇄원칙.원칙적용.변경사항_반영후;

public class MultiplyOperation extends AbstractOperation {
	public int operate(int firstNumber, int secondNumber) {
		int answer = firstNumber * secondNumber;

		return answer;
	}
}
