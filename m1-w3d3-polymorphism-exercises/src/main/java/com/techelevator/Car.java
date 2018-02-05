package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Car implements Vehicle {
	
	
	public Car(boolean isPullingTrailer) {
		this.isPullingTrailer = isPullingTrailer;
	}

	private boolean isPullingTrailer;
	
	@Override
	public BigDecimal calculateToll(int distance) {
		double toll = distance * 0.02;
		if (isPullingTrailer) {
			toll += 1.00;
		}
		return new BigDecimal(toll).setScale(2, RoundingMode.HALF_UP);
	}
}
