package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	Car trailerCar;	
	Car noTrailerCar;
	
	@Before
	public void setUp() throws Exception {
		trailerCar = new Car(true);
		noTrailerCar = new Car(false);
	}

	@Test
	public void testTrailerCarToll() {
		assertEquals(new BigDecimal("3.00"), trailerCar.calculateToll(100));
	}
	
	@Test
	public void testNoTrailerCarToll() {
		assertEquals(new BigDecimal("2.00"), noTrailerCar.calculateToll(100));
	}
	
	

}
