package com.techelevator.product;

public class Product {

	private String name; //Name of the product
	private double price; //price of the product
	private double weightInOunces; //weight (in ounces) of the product
	
	//getter/setter always public 
	//Getter
	public String getName() {
		return name;
	}
	//Setter... maintains same datatype of name variable above 
	public void setName(String newProductName) {
		name = newProductName;
	}
	//Getter for getting Price
	public double getPrice() {
		return price;
	}
	//Setter for setting Price
	public void setPrice(double newProductPrice) {
		price = newProductPrice;
	}
	//Getter for getting Price
	public double getWeightInOunces() {
		return weightInOunces;
	}
	//Setter for setting Price
	public void setWeightInOunces(double newWeightInOunces) {
		weightInOunces = newWeightInOunces;
	}
}
