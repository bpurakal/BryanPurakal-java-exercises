package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException  {

		try (PrintWriter writer = new PrintWriter("FizzBuzz.txt")) {

			for (int number = 1; number <= 300; number++) {

				if ((number % 3 == 0) && (number % 5 == 0)) {
					writer.println("FizzBuzz");
				} else if (number % 3 == 0) {
					writer.println("Fizz");
				} else if (number % 5 == 0) {
					writer.println("Buzz");
				} else {
					writer.println(Integer.toString(number));
				}

			}

	} 
//			catch (Exception e) {
//			System.out.println("File not found");
//			System.exit(1);
//		}
	}

}
