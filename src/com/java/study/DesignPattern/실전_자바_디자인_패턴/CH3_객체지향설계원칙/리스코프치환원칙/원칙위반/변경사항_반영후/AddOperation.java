package com.java.study.DesignPattern.실전_자바_디자인_패턴.CH3_객체지향설계원칙.리스코프치환원칙.원칙위반.변경사항_반영후;

public class AddOperation extends AbstractOperation {
	public int operate(int firstNumber, int secondNumber) {
		int answer = firstNumber + secondNumber;

		return answer;
	}
}
