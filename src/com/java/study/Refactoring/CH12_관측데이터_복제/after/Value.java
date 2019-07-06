package com.java.study.Refactoring.CH12_관측데이터_복제.after;

import java.util.ArrayList;
import java.util.List;

public class Value {
	private int _value = 0;
	private final List<ValueListener> _listeners = new ArrayList<ValueListener>();

	public Value(int value) {
		_value = value;
	}

	public void setValue(int value) {
		_value = value;
		notifyToListeners();
	}

	public int getValue() {
		return _value;
	}

	public void addValueListener(ValueListener listener) {
		_listeners.add(listener);
	}

	public boolean removeValueListener(ValueListener listener) {
		return _listeners.remove(listener);
	}

	private void notifyToListeners() {
		for (ValueListener listener : _listeners) {
			listener.valueChanged(new ValueChangeEvent(this));
		}
	}
}
