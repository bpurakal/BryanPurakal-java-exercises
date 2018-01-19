package com.techelevator;

import java.util.Scanner;

public class PriceConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please put in a price: ");
		String price = input.nextLine();
		
		double actualPrice = Double.parseDouble(price);
		
		actualPrice = actualPrice /2;
		
		System.out.printf("Your price is %.2f!", actualPrice); //actualPrice would go where % is. 
		
	}

}
