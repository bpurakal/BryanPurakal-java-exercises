package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	 public int add(int addend) {
		 return currentValue += addend;
	 }
	 
	 public int multiply(int multiplier) {
		 return currentValue *= multiplier;
	 }
	 public int subtract(int subtrahend) {
		 return currentValue -= subtrahend;
	 }
	 public int power(int exponent) {
		 return currentValue = (int)Math.pow(currentValue, (double)exponent);
	 }
	
	 public void reset() {
		 currentValue = 0;
	 }
}
