package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int bookedFirstClassSeats = 0;
	//private int availableFirstClassSeats; //derived. because you calculate it (and Dont need at first because total booked seats is 0) 
	//no point in trying to in trying to set Available seats bc total seats - booked is always changing and will calculate available. 
	private int totalFirstClassSeats;
	private int bookedCoachSeats = 0;
	//private int availableCoachSeats; //(derived). dont need bc total booked Coach seats is 0
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		//use assignment statements to assign values to respective instance variables
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	};//constructors are a shortcut to setting individual parameters, cleaner, less code. 
	
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if (totalNumberOfSeats <= getAvailableFirstClassSeats()) {
				this.bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		} else {
			if (totalNumberOfSeats <= getAvailableCoachSeats()) {
				this.bookedCoachSeats += totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
		}
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	public int getTotalFirstClassSeats(){
		return totalFirstClassSeats;
	}
	
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	
	
	

	
}
