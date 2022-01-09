package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class DependencyInjectionTest {

	@BeforeEach
	void init(TestInfo testInfo) {
		String displayName = testInfo.getDisplayName();
		System.out.println("Before each for method display name: "+displayName);
		System.out.println("Before each for method Tags: "+ testInfo.getTags());
	}
	
	@Test
	@Tag("my-tag")
	void test1(TestReporter testReporter) {
		testReporter.publishEntry("Hello World");//For debug purpose
		System.out.println("Executiong test1()");
	}
	
}
