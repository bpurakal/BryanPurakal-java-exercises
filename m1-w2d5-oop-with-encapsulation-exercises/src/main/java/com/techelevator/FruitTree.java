package com.techelevator;

public class FruitTree {

	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	
	public FruitTree(String typeOfFruit, int startingNumber) { //constructor has no return type, may have arguments
		//paramaters can be named whatever you want i can name startingPieces numberOfFruit if i wanted to
		this.typeOfFruit = typeOfFruit; //sets type of fruit
		this.piecesOfFruitLeft = startingNumber; //sets initial amount
	}
	
		
	 public boolean pickFruit(int numberToPick) { //can be named numberOfPiecesToRemove
		if (numberToPick > piecesOfFruitLeft) {
			return false;
		}else {
			piecesOfFruitLeft -= numberToPick;
			return true;
		}
	}
	 
	 public String getTypeOfFruit() {
		 return typeOfFruit;
	 }
	 public int getPiecesOfFruitLeft() {
		 return piecesOfFruitLeft;
	 }
	
}
