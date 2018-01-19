package com.techelevator;
import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		
		String name = input.nextLine();
	
		System.out.println("Hello " + name);
	}

}
