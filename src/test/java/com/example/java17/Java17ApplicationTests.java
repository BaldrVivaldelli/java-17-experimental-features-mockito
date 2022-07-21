package com.example.java17;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Java17ApplicationTests {

	@Test
	public void testPatternMatching(){
		Integer testOne = 1;
		Java17ApplicationTests.formatter(testOne);
	}


	static String formatter(Object o) {
		return switch (o) {
			case Integer i -> String.format("int %d", i);
			case Long l    -> String.format("long %d", l);
			case Double d  -> String.format("double %f", d);
			case String s  -> String.format("String %s", s);
			default        -> o.toString();
		};
	 }

}
