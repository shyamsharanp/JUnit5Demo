package com.simplilearn.JUnit5Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit5 assert example")
@RunWith(JUnitPlatform.class)
public class AssertionExample2 {

	@SuppressWarnings("unused")
	@Test
	public void asserTest() {
		String str = null;
		String str2 = "Some value";
		
		Assertions.assertNull(str);
		Assertions.assertNull(str2);
		
		Assertions.assertTrue(5>0);
		Assertions.assertFalse(5<0);
		
		Assertions.assertSame(str2, str2);
		
		String[] a1 = {"A", "B"};
		String[] a2 = {"A", "B"};
		
		Assertions.assertArrayEquals(a1, a2);
		
		Assertions.assertThrows(RuntimeException.class, ()-> {
			throw new RuntimeException() ;
		});
		
	}

}
