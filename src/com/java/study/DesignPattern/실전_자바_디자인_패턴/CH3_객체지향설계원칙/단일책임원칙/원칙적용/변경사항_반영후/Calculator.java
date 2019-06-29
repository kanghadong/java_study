package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.단일책임원칙.원칙적용.변경사항_반영후;

public class Calculator {
	private AddOperation addOperation;
	private SubtractOperation subtractOperation;
	private MultiplyOperation multiplyOperation;
	private DivideOperation divideOperation;

	public int calculate(String operator, int firstNumber, int secondNumber) {
		int answer = 0;

		if (operator.equals("+")) {
			answer = this.addOperation.operate(firstNumber, secondNumber);
		} else if (operator.equals("-")) {
			answer = this.subtractOperation.operate(firstNumber, secondNumber);
		} else if (operator.equals("*")) {
			answer = this.multiplyOperation.operate(firstNumber, secondNumber);
		} else if (operator.equals("/")) {
			answer = this.divideOperation.operate(firstNumber, secondNumber);
		}

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

	public void setDivideOperation(DivideOperation divideOperation) {
		this.divideOperation = divideOperation;
	}
}
