package com.simplilearn.JUnit5Demo;

public class Calculator {

	ResultPublisher resultPublisher;
	
	public Calculator(ResultPublisher resultPublisher) {
		this.resultPublisher = resultPublisher;
	}

	public int calculate(int a, int b) {
		boolean val = resultPublisher.publish();
		if (val == true) {
			return a * b;
		} else {
			return a + b;
		}
	}
}
