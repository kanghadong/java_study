package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.개방폐쇄원칙.원칙적용.변경사항_반영전;

public class Client {
	public static void main(String[] args) throws Exception {
		Calculator calculator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;
		int answer = 0;
		AbstractOperation operation = null;

		operation = new AddOperation();
		calculator.setOperation(operation);
		answer = calculator.calculate(firstNumber, secondNumber);
		System.out.println(firstNumber + "+" + secondNumber + "=" + answer);

		operation = new SubtractOperation();
		calculator.setOperation(operation);
		answer = calculator.calculate(firstNumber, secondNumber);
		System.out.println(firstNumber + "-" + secondNumber + "=" + answer);

		operation = new MultiplyOperation();
		calculator.setOperation(operation);
		answer = calculator.calculate(firstNumber, secondNumber);
		System.out.println(firstNumber + "*" + secondNumber + "=" + answer);
	}
}
