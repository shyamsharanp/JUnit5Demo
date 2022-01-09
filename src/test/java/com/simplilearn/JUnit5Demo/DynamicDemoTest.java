package com.simplilearn.JUnit5Demo;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicDemoTest {
	@BeforeEach
	void runBeforeEach() {
		System.out.println("Before each..");
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> collection = new ArrayList();
		
		collection.add(DynamicTest.dynamicTest("Simple dynamic test", ()-> {
			Assertions.assertTrue(true);
		}));
		
		collection.add(DynamicTest.dynamicTest("Simple dynamic test2", ()-> {
			Assertions.assertTrue(true);
		}));
		
		return collection;
	}
	
	/*
	 * class ExecutableClass implements Executable {
	 * 
	 * }
	 */

}
