package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@DisplayName("This is example1 test suit..")
@RunWith(JUnitPlatform.class)
public class Example1 {
	
	@BeforeAll
	static void initAll() { //should be static if it is before all..
		System.out.println("Before ALL excecutes..");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before Each method executes..");
	}

	@Test
	@DisplayName("This is success test.. display name.")
	void successTest() {
		System.out.println("Executing success test..");
	}
	
	@Test
	void successTest1() {
		System.out.println("Executing success test1..");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After each method executes..");
	}
	
	@AfterAll
	static void tearDownAll() { //Should be static method if it is After all..
		System.out.println("After ALL method executes..");
	}
	
	
}
