package org.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.kata.FizzBuzz;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	private String[] spected = {
			"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", 
			"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", 
			"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", 
			"31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", 
			"41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", 
			"Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", 
			"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", 
			"71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", 
			"Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", 
			"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz", 
	};
	
	private String[] spectedStage2 = {
			"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", 
			"11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", 
			"Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", 
			"Fizz", "Fizz", "Fizz", "Fizz", "Buzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz", 
			"41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", 
			"Fizz", "Buzz", "Fizz", "Fizz", "Buzz", "Buzz", "Fizz", "Buzz", "Buzz", "FizzBuzz", 
			"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", 
			"71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", 
			"Fizz", "82", "Fizz", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", 
			"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz", 
	};
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void sayNextNumberInSequenceOfCero() {
		assertEquals("El valor siguiente del cero no es correcto", "1", fizzBuzz.evaluate(1));
	}
	
	@Test
	public void sayNextNumberInSequenceOfOne() {
		assertEquals("El valor siguiente del uno no es correcto", "2", fizzBuzz.evaluate(2));
	}
	
	@Test
	public void sayNextNumberInSequenceOfTwo() {
		assertEquals("El valor siguiente del dos no es correcto", "Fizz", fizzBuzz.evaluate(3));
	}
	
	@Test
	public void sayNextNumberInSequenceOfThree() {
		assertEquals("El valor siguiente del tre no es correcto", "4", fizzBuzz.evaluate(4));
	}
	
	@Test
	public void sayNextNumberInSequenceOfFour() {
		assertEquals("El valor siguiente del cuatro no es correcto", "Buzz", fizzBuzz.evaluate(5));
	}
	
	@Test
	public void sayNextNumberInSequenceOfFive() {
		assertEquals("El valor siguiente del cinco no es correcto", "Fizz", fizzBuzz.evaluate(6));
	}
	
	@Test
	public void sayNextNumberInSequenceOfFourteen() {
		assertEquals("El valor siguiente de catorce no es correcto", "FizzBuzz", fizzBuzz.evaluate(15));
	}
	
	@Test
	public void sayNextNumberInSequenceOfTheFirstHundred() {
		for (int i = 1; i <= spected.length; i++) {
			assertEquals("El valor siguiente de " + String.valueOf(i - 1) + " no es correcto", spected[i - 1], fizzBuzz.evaluate(i));
		}
	}
	
	@Test
	public void sayNextNumberInSequenceOfTheFirstHundredSatge2() {
		for (int i = 1; i <= spected.length; i++) {
			assertEquals("El valor siguiente de " + String.valueOf(i - 1) + " no es correcto", spectedStage2[i - 1], fizzBuzz.evaluateStage2(i));
		}
	}
	
	
}
