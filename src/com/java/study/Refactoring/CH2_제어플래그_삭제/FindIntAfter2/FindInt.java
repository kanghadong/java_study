package com.java.study.Refactoring.CH2_제어플래그_삭제.FindIntAfter2;

public class FindInt {
	public static boolean find(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}

		return false;
	}
}
