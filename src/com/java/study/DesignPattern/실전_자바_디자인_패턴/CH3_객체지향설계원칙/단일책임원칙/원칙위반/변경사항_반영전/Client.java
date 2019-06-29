package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.단일책임원칙.원칙위반.변경사항_반영전;

public class Client {
	public static void main(String[] args) throws Exception {
		Calculator calculator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;

		String operator = "+";
		int answer = calculator.calculate(operator, firstNumber, secondNumber);
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);

		operator = "-";
		answer = calculator.calculate(operator, firstNumber, secondNumber);
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);

		operator = "*";
		answer = calculator.calculate(operator, firstNumber, secondNumber);
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
	}
}
