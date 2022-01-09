package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {
	
	Calculator c;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@DisplayName("Adding 1, 3")
	@Test
	public void testAdditionCalculate() {
		int actualValue = c.calculate(1, 3);
		Assertions.assertEquals(4, actualValue);
	}

}
