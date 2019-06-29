package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.개방폐쇄원칙.원칙적용.변경사항_반영전;

public class Calculator {
	private AbstractOperation operation;

	public int calculate(int firstNumber, int secondNumber) {
		int answer = this.operation.operate(firstNumber, secondNumber);

		return answer;
	}

	public void setOperation(AbstractOperation operation) {
		this.operation = operation;
	}
}
