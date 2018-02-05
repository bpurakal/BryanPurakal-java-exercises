package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truck implements Vehicle {

	private int numberOfAxles;

	@Override
	public BigDecimal calculateToll(int distance) {
		BigDecimal toll;
		if(numberOfAxles <= 4) {
			return toll = new BigDecimal(distance *.04).setScale(2, RoundingMode.HALF_UP);
		}
		else if(numberOfAxles ==6) {
			return toll = new BigDecimal(distance * .045).setScale(2, RoundingMode.HALF_UP);
		}
		else{
			return toll = new BigDecimal(distance * .048).setScale(2, RoundingMode.HALF_UP);
		}
		
		
	}
		public int getNumberOfAxles() {
			return numberOfAxles;
		}

		public Truck(int numberOfAxles) {
			this.numberOfAxles = numberOfAxles;
		}


}
