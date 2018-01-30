package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * every test requires an object as part of arrange step. 
 * Then we act.. or exercise this object (read file, database, etc - > get value back)
 * assertNotNull,AssertEqual, AssertFail, AssertTrue, etc
 * in arrange step we generally look for classes which means we test for instance of the class
 * 
 * what is it that we're testing, (how do i look at a class and how do i know what im supposed to test)
 * tests should be simple and focused on class which is under test
 * Arrange what i tested, Act on what im testing, Assert action actually resolved to what i expected
 */

public class EmployeeTest {

	private Employee employee; //Arrange
	
	@Before
	public void setUp() throws Exception {
		employee = new Employee(1234, "Bryan", "Purakal", 500000.00); //Arrange
	}

	@Test
	public void testEmployee() {
		assertNotNull(employee); //make sure we have employee object
	}

	@Test
	public void testGetEmployeeId() {
		assertNotNull(employee.getEmployeeId());
	}

	@Test
	public void testFirstName() {
		assertNotNull(employee.FirstName());
	}

	@Test
	public void testLastName() {
		assertNotNull(employee.LastName());
	}

	@Test
	public void testFullName() {
			assertNotNull(employee.FullName());
	}

	@Test
	public void testDepartment() { //we dont have department set.. <ACT>
		employee.setDepartment("myDepartment"); //finished with ACT after setting
		assertEquals("myDepartment", employee.getDepartment()); //if all went well, the string we get should be similar 
		//opposite of setting dept is getting dept
		//we dont typically test for getters/setters bc they are generally very simple we generally test the other methods
	}

	@Test
	public void testGetAnnualSalary() {
		assertEquals(500000.00, employee.getAnnualSalary(), 0.01);
		//double fudge factor -> third variable to set cushion 
	}

	@Test
	public void testRaiseSalary() {
		employee.RaiseSalary(25); //act
		assertEquals(625000.00, employee.getAnnualSalary(), 0.01);
	}

}
