package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		//Input + Setup
		Scanner input = new Scanner(System.in);
		int fibNum1 = 0;
		int fibNum2 = 1;
		int fibNumQueued = 0; //Initialized to zero 
		
		//User Interaction
		System.out.println("Please enter the Fibonacci number: ");
		int fNumber = input.nextInt();
		
		//Loop
			for (int i =0; i<fNumber; i++) {
				if(fibNum1 <= fNumber) {
				System.out.print(fibNum1 + " ");
				fibNumQueued = (fibNum1 + fibNum2);
				fibNum1 = fibNum2;
				fibNum2 = fibNumQueued;
				}
			}
		}
		
	}


