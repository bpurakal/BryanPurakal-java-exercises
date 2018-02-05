package com.techelevator;

public class KataFizzBuzz {

	public static String fizzBuzz(int input) {

		String finalString = "";

		if (input < 1 || input > 100) {
			finalString = "";
		} else if (isFiveInItAndIsItDivisibleByFive(input) && isThreeInItAndIsItDivisibleByThree(input)){
			finalString = "FizzBuzz";
		} else if (isThreeInItAndIsItDivisibleByThree(input)) {
			finalString = "Fizz";
		} else if (isFiveInItAndIsItDivisibleByFive(input)){
			finalString = "Buzz";
		} else {
			finalString = Integer.toString(input);
		}

		return finalString;
	}
	
	private static boolean isThreeInItAndIsItDivisibleByThree(int input) {
		if(input %3 == 0 || isItInIt(input, "3")) {
			return true;
		}
		return false;
	}
	
	private static boolean isFiveInItAndIsItDivisibleByFive(int input) {
		if(input %5 == 0 || isItInIt(input, "5")) {
			return true;
		}
		return false;
	}
	
	public static boolean isItInIt(int input, String searchForIt) {
	String searchedString = Integer.toString(input);
	if (searchedString.contains(searchForIt)) {
		return true;
	}
	return false;

	}
}
