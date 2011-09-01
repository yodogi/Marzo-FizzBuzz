package org.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.kata.FizzBuzz;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void sayNextNumberInSequenceOfOne() {
		assertEquals("El valor retornado no uno", fizzBuzz.evaluate(1) , "1");
	}
	
}
