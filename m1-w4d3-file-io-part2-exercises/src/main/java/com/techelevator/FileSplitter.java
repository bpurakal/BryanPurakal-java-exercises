package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) throws IOException {
		
		File inputFile = getInputFileFromUser();
		Scanner userFile = new Scanner(System.in);
		
		System.out.println("Please enter the amount of lines per file: ");
		String stringLinesPerFile = userFile.nextLine();
		int linesPerFile = Integer.parseInt(stringLinesPerFile);
		
		int fileSequenceNumber = 1;
		for (int i = 0; i <linesPerFile; i++) {
			File newFile = new File("Shortened Text File " + fileSequenceNumber);
			newFile.createNewFile();
			try(Scanner fileScanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(newFile)) {
				for (i=0; i<linesPerFile; i++)
				writer.println(fileScanner.nextLine());
			}
			if (i==linesPerFile) {
				fileSequenceNumber +=1;
				newFile = new File("Shortened Text File " + fileSequenceNumber);
				newFile.createNewFile();
			}
		}

	}
	
	
	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter path to input file >>>");
		String path = userInput.nextLine();
		return null;
	}
	

}
