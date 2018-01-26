package com.techelevator.company;

public class Company {
	
	//Instance variables
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	//Getter & Setters
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
		//same as this.name = newName;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
		
	}
	
	public void setNumberOfEmployees(int newNumberOfEmployees) {
		numberOfEmployees = newNumberOfEmployees;
		//this is a hidden parameter we dont have to type
		//same as this.numberOfEmployees = newNumberOfEmployees;
	}
	public double getRevenue() {
		return revenue; //same as this.revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
		//this.instanceVariable = Paramater;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	
	
	//Instance methods
	public String getCompanySize() {
		if(numberOfEmployees <= 50) {
			return "small";
		}else if (numberOfEmployees >= 51 && numberOfEmployees <= 250) {
			return "medium";
		}else {
			return "large";
		}
	}
	
	public double getProfit() {
		return revenue - expenses;
	}

}
