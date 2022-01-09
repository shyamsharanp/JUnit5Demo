package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {
	
	Calculator c;
	ResultPublisher resultPublisher = Mockito.mock(ResultPublisher.class);
	
	@BeforeEach
	public void init() {
		c = new Calculator(resultPublisher);
	}
	
	@DisplayName("Adding 1, 3")
	@Test
	public void testAdditionCalculate() {
		Mockito.when(resultPublisher.publish()).thenReturn(false);
		int actualValue = c.calculate(1, 3);
		Assertions.assertEquals(4, actualValue);
	}
	
	@DisplayName("Multiplying 1, 3")
	@Test
	public void testMultiplyCalculate() {
		Mockito.when(resultPublisher.publish()).thenReturn(true);
		int actualValue = c.calculate(1, 3);
		Assertions.assertEquals(3, actualValue);
	}

}
