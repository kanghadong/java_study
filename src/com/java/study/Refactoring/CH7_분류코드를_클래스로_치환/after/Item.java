package com.java.study.Refactoring.CH7_분류코드를_클래스로_치환.after;

public class Item {
	private final ItemType _itemtype;
	private final String _title;
	private final int _price;

	public Item(ItemType itemtype, String title, int price) {
		_itemtype = itemtype;
		_title = title;
		_price = price;
	}

	public String getTitle() {
		return _title;
	}

	public int getPrice() {
		return _price;
	}

	public String toString() {
		return "[" + _itemtype.getTypecode() + "," + getTitle() + "," + getPrice() + "]";
	}
}
