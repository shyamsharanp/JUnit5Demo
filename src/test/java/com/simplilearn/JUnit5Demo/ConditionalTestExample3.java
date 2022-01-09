package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ConditionalTestExample3 {
	
	@Test
	@EnabledOnOs({OS.MAC})
	public void runOnWindows() {
		System.out.println("test running on MAC...");
	}
	
	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnMac() {
		System.out.println("test running on Windows...");
	}

}
