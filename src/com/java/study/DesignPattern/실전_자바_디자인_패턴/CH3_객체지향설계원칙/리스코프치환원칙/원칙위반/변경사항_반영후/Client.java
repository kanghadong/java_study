package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.리스코프치환원칙.원칙위반.변경사항_반영후;

public class Client {
	public static void main(String[] args) throws Exception {
		Calculator calculator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;
		int answer = 0;

		AbstractOperation operation = null;

		operation = new AddOperation();
		answer = calculator.calculate(operation, firstNumber, secondNumber);
		System.out.println(firstNumber + "+" + secondNumber + "=" + answer);

		operation = new SubtractOperation();
		answer = calculator.calculate(operation, firstNumber, secondNumber);
		System.out.println(firstNumber + "-" + secondNumber + "=" + answer);

		operation = new MultiplyOperation();
		answer = calculator.calculate(operation, firstNumber, secondNumber);
		System.out.println(firstNumber + "*" + secondNumber + "=" + answer);

		secondNumber = 0;
		operation = new DivideOperation();
		answer = calculator.calculate(operation, firstNumber, secondNumber);
		System.out.println(firstNumber + "/" + secondNumber + "=" + answer);
	}
}
