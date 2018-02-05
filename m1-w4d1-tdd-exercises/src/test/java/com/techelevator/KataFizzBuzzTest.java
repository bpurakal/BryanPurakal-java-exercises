package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	@Test
	public void testIfOutsideOfBoundaries() {
		assertEquals("", KataFizzBuzz.fizzBuzz(0));
	}
	
	@Test
	public void testIfValidNumber() {
		assertEquals("1", KataFizzBuzz.fizzBuzz(1));
	}
	
	@Test
	public void testIfFizz() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(3));
	}
	
	@Test
	public void testIfBuzz() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(5));
	}
	
	@Test
	public void testIfFizzBuzz() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(15));
	}
	
	@Test
	public void testIfHasThree() {
		assertEquals("Fizz", KataFizzBuzz.fizzBuzz(13));
	}
	
	@Test
	public void testIfHasFive() {
		assertEquals("Buzz", KataFizzBuzz.fizzBuzz(58));
	}
	
	@Test
	public void testIfHasThreeOrFiveAndDivisibleByEither() {
		assertEquals("FizzBuzz", KataFizzBuzz.fizzBuzz(54));
	}
}
