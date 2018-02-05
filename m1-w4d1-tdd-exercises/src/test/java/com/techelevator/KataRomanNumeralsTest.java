package com.techelevator;

import org.junit.*;

/* 
 * 1) make the testThatOneIsI class.. 
 * see that it fails because convertToRomanNumerals() does not exist
 * 2) create logic to fulfill test
 * 3) test pass
 * 4) create testThatTwoIsII method.. repeat cycle
 */
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	@Test
	public void testThatOneIsI() {//tests are always void
	assertEquals("I", KataRomanNumerals.convertToRomanNumerals(1)); //expected, what is actually returned.
	}
	
	@Test
	public void testThatTwoIsII() {
		assertEquals("II", KataRomanNumerals.convertToRomanNumerals(2));
	}
	
	@Test 
	public void testThatFiveIsV() {
		assertEquals("V", KataRomanNumerals.convertToRomanNumerals(5));
	}
	
	@Test 
	public void testThatSevenIsVII() {
		assertEquals("VII", KataRomanNumerals.convertToRomanNumerals(7));
	}
	
	@Test
	public void testThatElevenIsXI() {
		assertEquals("XI", KataRomanNumerals.convertToRomanNumerals(11));
	}
	
	@Test
	public void testThatFiftySixIsLVI() {
		assertEquals("LVI", KataRomanNumerals.convertToRomanNumerals(56));
	}
	
	@Test
	public void testThatFourIsIV() {
		assertEquals("IV", KataRomanNumerals.convertToRomanNumerals(4));
	}
	
	@Test
	public void testThatFiftyFourIsLIV() {
		assertEquals("LIV", KataRomanNumerals.convertToRomanNumerals(54));
	}
	
	@Test
	public void testThatNineIsIX() {
		assertEquals("IX", KataRomanNumerals.convertToRomanNumerals(9));
	}
	
//	@Test
//	public void testThatFortyNineisIL() {
//		assertEquals("XLIX", KataRomanNumerals.convertToRomanNumerals(49));
//	}
	
}
