package com.java.study.Refactoring.CH7_분류코드를_클래스로_치환.after;

public class ItemType {
	public static final ItemType BOOK =  new ItemType(0);
	public static final ItemType DVD = new ItemType(1);
	public static final ItemType SOFTWARE = new ItemType(2);

	private final int _typecode;

	private ItemType(int typecode) {
		_typecode = typecode;
	}

	public int getTypecode() {
		return _typecode;
	}

}
