package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class NestedTestsExample4 {
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each  - Outer");
		
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each  - Outer");
		
	}
	
	@Nested
	class A {
		
		@BeforeEach
		void beforeEach1() {
			System.out.println("Before inner");
		}
		
		@Test
		void sampleTestUnderClassA() {
			System.out.println("Exmaple test for method A");
		}
		
		@AfterEach
		void afterEach1() {
			System.out.println("After inner");
		}
	}

}
