package com.java.study.Refactoring.CH12_관측데이터_복제.after;

public class ValueChangeEvent {
	private final Value _source;

	public ValueChangeEvent(Value source) {
		_source = source;
	}

	public Value getSource() {
		return _source;
	}
}
