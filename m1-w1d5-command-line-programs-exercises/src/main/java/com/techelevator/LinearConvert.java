package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

/* public class LinearConvert {

	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner(System.in);
		
		//User Interaction
		System.out.println("Please enter the length: " );
		int length = Integer.parseInt(input.nextLine());
		System.out.println("Is the measurement in meter or feet?");
		String lengthType = input.nextLine();
		
		lengthType = lengthType.toUpperCase();
		
		int convertedLength = length;
		//Calculations
		if (lengthType == "METER") {
			convertedLength *= 3.2808399;
			System.out.println(length+ "m is " + convertedLength + "f.");
		}else {
			convertedLength *= 0.3048;
			System.out.println(length + "f is " + convertedLength + "m.");
		}
	
	}

} */


/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		
		//input
		Scanner input = new Scanner(System.in);
		
		//User Interaction
		System.out.println("Please enter the length: " );
		String length = input.nextLine();
		System.out.println("Is the measurement in (m)eter or (f)eet?");
		String lengthType = input.nextLine();
		lengthType = lengthType.toUpperCase();
		
		//Parse
		double actualLength = Double.parseDouble(length);
		char actualLengthType = lengthType.charAt(0);
		
		double convertedLength;
		//Calculations
		if (lengthType == "M") {
			convertedLength = actualLength * 3.2808399;
			System.out.println(actualLength + "m is " + convertedLength + "f.");
		}else {
			convertedLength = actualLength *0.3048;
			System.out.println(actualLength + "f is " + convertedLength + "m.");
		}
	
	}

}



