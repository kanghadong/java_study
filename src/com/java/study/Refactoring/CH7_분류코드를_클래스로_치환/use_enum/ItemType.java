package com.java.study.Refactoring.CH7_분류코드를_클래스로_치환.use_enum;

public enum ItemType {
	BOOK(0),
	DVD(1),
	SOFTWARE(2);

	private final int _typecode;

	private ItemType(int typecode) {
		_typecode = typecode;
	}

	public int getTypecode() {
		return _typecode;
	}

}
