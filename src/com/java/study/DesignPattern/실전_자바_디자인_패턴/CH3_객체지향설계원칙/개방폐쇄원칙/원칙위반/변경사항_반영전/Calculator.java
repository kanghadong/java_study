package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.개방폐쇄원칙.원칙위반.변경사항_반영전;

public class Calculator {
	private AddOperation addOperation;
	private SubtractOperation subtractOperation;
	private MultiplyOperation multiplyOperation;

	public int add(int firstNumber, int secondNumber) {
		int answer = this.addOperation.operate(firstNumber, secondNumber);

		return answer;
	}

	public int subtract(int firstNumber, int secondNumber) {
		int answer = this.subtractOperation.operate(firstNumber, secondNumber);

		return answer;
	}

	public int multiply(int firstNumber, int secondNumber) {
		int answer = this.multiplyOperation.operate(firstNumber, secondNumber);

		return answer;
	}

	public void setAddOperation(AddOperation addOperation) {
		this.addOperation = addOperation;
	}

	public void setSubtractOperation(SubtractOperation subtractOperation) {
		this.subtractOperation = subtractOperation;
	}

	public void setMultiplyOperation(MultiplyOperation multiplyOperation) {
		this.multiplyOperation = multiplyOperation;
	}
}
