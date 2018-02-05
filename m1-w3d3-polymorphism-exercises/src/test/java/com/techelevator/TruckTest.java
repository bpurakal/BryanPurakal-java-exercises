package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TruckTest {

	Truck testTruck4;	
	Truck testTruck6;	
	Truck testTruck8;	
	
	@Before
	public void setUp() throws Exception {
		testTruck4 = new Truck(4);
		testTruck6 = new Truck(6);
		testTruck8 = new Truck(8);
	
	}

	@Test
	public void test4AxleTruckToll() {
		assertEquals(new BigDecimal("4.00"), testTruck4.calculateToll(100));
	}
	@Test
	public void test6AxleTruckToll() {
		assertEquals(new BigDecimal("4.50"), testTruck6.calculateToll(100));
	}
	@Test
	public void test8AxleTruckToll() {
		assertEquals(new BigDecimal("4.80"), testTruck8.calculateToll(100));
	}
	

}
