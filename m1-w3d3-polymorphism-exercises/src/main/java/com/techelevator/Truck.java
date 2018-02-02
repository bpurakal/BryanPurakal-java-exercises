package com.techelevator;

import java.math.BigDecimal;

public class Truck implements Vehicle {

	private int numberOfAxles;

	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal toll;
		if(numberOfAxles == 4) {
			return toll = new BigDecimal(distance *.04);
		}
		else if(numberOfAxles ==6) {
			return toll = new BigDecimal(distance * .045);
		}
		else{
			return toll = new BigDecimal(distance * .048);
		}
		
		
	}
		public int getNumberOfAxles() {
			return numberOfAxles;
		}

		public Truck(int numberOfAxles) {
			this.numberOfAxles = numberOfAxles;
		}


}
