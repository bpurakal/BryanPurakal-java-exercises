package com.techelevator.shoppingcart;

public class ShoppingCart {
	
	//Instance Variables 
	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;
	
	//Getter & Setter to deal with Instance Variables directly
	public void setTotalNumberOfItems(int newTotalNumberOfItems) {
		totalNumberOfItems = newTotalNumberOfItems;
	}
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	
	public void setTotalAmountOwed(int newTotalAmountOwed) {
		totalAmountOwed = newTotalAmountOwed;
	}
	
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	 public double getAveragePricePerItem() {
		 if (totalNumberOfItems == 0) {
			 return 0.0;
		 }
		 else{
			 return totalAmountOwed / totalNumberOfItems;
		 }
	 }
	 
	 public void addItems(int numberOfItems, double pricePerItem) {
		
		 totalNumberOfItems += numberOfItems;
		 totalAmountOwed += pricePerItem *  numberOfItems;
	 }
	 public void empty() {
		 totalNumberOfItems = 0;
		 totalAmountOwed = 0;
	 }
}
