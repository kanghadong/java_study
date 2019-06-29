package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.단일책임원칙.원칙위반.변경사항_반영후;

public class Calculator {
	public int calculate(String operator, int firstNumber, int secondNumber) {
		int answer = 0;

		if (operator.equals("+")) {
			answer = firstNumber + secondNumber;
		} else if (operator.equals("-")) {
			answer = firstNumber - secondNumber;
		} else if (operator.equals("*")) {
			answer = firstNumber * secondNumber;
		} else if (operator.equals("/")) {
			answer = firstNumber / secondNumber;
		}

		return answer;
	}
}
