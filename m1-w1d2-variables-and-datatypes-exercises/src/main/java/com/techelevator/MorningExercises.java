package com.techelevator;

public class MorningExercises {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises = 26;
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;
		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "Tech Elevator";
		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		byte seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		float pi = 3.1416f; //needs f on end to convert from double to float
		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Bryan";
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		byte mouseButtons = 2;
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		byte battPercent = 98; 
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int difference = 121 - 27;
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double addition = 12.3 + 32.1;
		/*
		12. Create a String that holds your full name.
		*/
		String fullName = "Bryan Purakal";
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String greeting = "Hello, " + fullName;
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";
		System.out.println(fullName);
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";
		System.out.println(fullName);
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
			String Saw = "Saw" + 2; 
			System.out.println(Saw);
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
			Saw += 0;
			System.out.println(Saw); 
		/*
		18. What is 4.4 divided by 2.2?
		*/
			double div1 = 4.4/2.2;
			System.out.println(div1);
		/*
		19. What is 5.4 divided by 2?
		*/
			double div2 = 5.4/2;
			System.out.println(div2);
		/*
		20. What is 5 divided by 2?
		*/
			double div3 = (5.0/2);
			System.out.println(div3);
		/*
		21. What is 5.0 divided by 2?
		*/
			double div4 = 5.0/2;
			System.out.println(div4);
			
			/* int x = 9;
			 * int y = 14;
			 * System.out.println(x / (double) y);
			 */
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
				double div5 = 66.6/100;
				System.out.println(div5);
				//answer is right, just not precise due to binary 
		/*
		23. What is the String "2" added to the number 10?
		*/
				/*an Error due to type mismatch
				String two = "2";
				byte ten = 10; 
				two + ten */
				String test = "2" + 10;
				System.out.println(test);
		/*
		24. What is 1,000,000,000 * 3?
		*/
			long billions = 1000000000L * 3; 
			System.out.println(billions);
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = true;
		/*
		26. Now set doneWithExercise to true.
		*/
		
	}

}
