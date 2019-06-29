package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.리스코프치환원칙.원칙위반.변경사항_반영후;

public class Calculator {
	public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
		if (operation instanceof DivideOperation) {
			if (secondNumber == 0) {
				return -999;
			}
		}

		int answer = operation.operate(firstNumber, secondNumber);

		return answer;
	}
}
