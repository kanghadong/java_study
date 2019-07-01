package com.java.study.Refactoring.CH9_분류코드를_상태_전략_패턴으로_치환.after;

public class StateStopped extends State {
	@Override
	public int getTypeCode() {
		return Logger.STATE_STOPPED;
	}
}
