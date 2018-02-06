package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	//alices_adventures_in_wonderland.txt

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = getInputFileFromUser();
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter the word to search >>> ");
		String searchWord = userInput.nextLine();

		System.out.print("Should the search be case sensitive? >>> ");
		String isCaseSensitive = userInput.nextLine();

		int finalWordCount = 0;
		int lineNumber = 0;

		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) { // while it can read file until no more new lines
				String line = fileScanner.nextLine();// grab the new line
				lineNumber += 1;
				if (isCaseSensitive.equalsIgnoreCase("N")) {
					if(line.toLowerCase().contains(searchWord.toLowerCase()));{
					System.out.println("" + lineNumber + ")" + line);}
				}else if (line.contains(searchWord)) {
					System.out.println("" + lineNumber + ") " + line);
				}
			}
		}
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();

		File inputFile = new File(path);
		if (inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path + " does not exist");
			System.exit(1); // Ends the program
		} else if (inputFile.isFile() == false) { // a file is normal if it is not a directory
			System.out.println(path + " is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
}