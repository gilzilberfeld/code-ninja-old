package com.codeninja.factorials;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTests {

	@Test
	public void factorials() {
		assertEquals(1, Factorial.calculate(1));
		assertEquals(2, Factorial.calculate(2));
		assertEquals(6, Factorial.calculate(3));
		assertEquals(3628800, Factorial.calculate(10));
		
	}

}
