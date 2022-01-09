package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedExample {

	Calculator c;
	
	@BeforeEach
	void init() {
		c=new Calculator();
	}
	
	@Test
	@RepeatedTest(100)
	void addNumber() {
		int actualValue = c.calculate(1,1);
		Assertions.assertEquals(2, actualValue);
	}
}
