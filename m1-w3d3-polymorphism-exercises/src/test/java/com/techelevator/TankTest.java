package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TankTest {

	Tank testTank;	
	@Before
	public void setUp() throws Exception {
		testTank = new Tank();
	}

	@Test
	public void testTankToll() {
		assertEquals(new BigDecimal("0"), testTank.calculateToll(100));
	}
	
	

}
