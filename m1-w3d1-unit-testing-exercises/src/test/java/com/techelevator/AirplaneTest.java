package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	private Airplane airplane; //Arrange
	
	@Before
	public void setUp() throws Exception {
		airplane = new Airplane(5, 10); //arrange {Constructor}
	}

	@Test
	public void testAirplane() {
		assertNotNull(airplane); //verify we have an airplane object
	}

	@Test
	public void testGetPlaneNumber() {
		assertNotNull(airplane.getPlaneNumber());
	}

	@Test
	public void testGetBookedFirstClassSeats() {
		assertNotNull(airplane.getBookedFirstClassSeats()); 
	}

	@Test
	public void testGetAvailableFirstClassSeats() {
		assertNotNull(airplane.getAvailableFirstClassSeats());
	}

	@Test
	public void testGetTotalFirstClassSeats() {
		assertNotNull(airplane.getTotalFirstClassSeats());
	}

	@Test
	public void testGetBookedCoachSeats() {
		assertNotNull(airplane.getBookedCoachSeats());
	}

	@Test
	public void testGetAvailableCoachSeats() {
		assertNotNull(airplane.getAvailableCoachSeats());
	}

	@Test
	public void testGetTotalCoachSeats() {
		assertEquals(10, airplane.getTotalCoachSeats());
	}

	@Test
	public void testReserve() {
		assertEquals(true, 10, 10 );
	}

}
