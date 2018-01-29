package com.techelevator;

public class Elevator {

	private int currentFloor =1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	//methods
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if((currentFloor < getNumberOfFloors()) && (!doorOpen)) {
			this.currentFloor = currentFloor +1;
		}
	}
		
		public void goDown(int desiredFloor) {
			if((currentFloor > 1) && (!doorOpen)){
				this.currentFloor = currentFloor -1;
			}
		}
		
		//constructor
		
		public Elevator (int totalNumberOfFloors) {
			this.numberOfFloors = totalNumberOfFloors;
		}
		
		//getter
		public int getCurrentFloor() {
			return currentFloor;
		}
		public int getNumberOfFloors() {
			return numberOfFloors;
		}
		public boolean isDoorOpen() {
			return doorOpen;
		}
	}

