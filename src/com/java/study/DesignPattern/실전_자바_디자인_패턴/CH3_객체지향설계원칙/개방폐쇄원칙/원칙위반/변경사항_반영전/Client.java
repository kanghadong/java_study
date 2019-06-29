package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.개방폐쇄원칙.원칙위반.변경사항_반영전;

public class Client {
	public static void main(String[] args) throws Exception {
		Calculator calculator = new Calculator();
		int firstNumber = 100;
		int secondNumber = 20;
		int answer = 0;

		AddOperation addOperation = new AddOperation();
		calculator.setAddOperation(addOperation);
		answer = calculator.add(firstNumber, secondNumber);
		System.out.println(firstNumber + "+" + secondNumber + "=" + answer);

		SubtractOperation subtractOperation = new SubtractOperation();
		calculator.setSubtractOperation(subtractOperation);
		answer = calculator.subtract(firstNumber, secondNumber);
		System.out.println(firstNumber + "-" + secondNumber + "=" + answer);

		MultiplyOperation multiplyOperation = new MultiplyOperation();
		calculator.setMultiplyOperation(multiplyOperation);
		answer = calculator.multiply(firstNumber, secondNumber);
		System.out.println(firstNumber + "*" + secondNumber + "=" + answer);
	}
}
