package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	private HomeworkAssignment hw; 

	@Before
	public void setUp() throws Exception {
		hw = new HomeworkAssignment(100);
	}

	@Test
	public void testHomeworkAssignment() {
		assertNotNull(hw);
	}

	@Test
	public void testTotalMarks() {
		hw.setTotalMarks(100);
		assertEquals(100, hw.getTotalMarks());
		
	}

	@Test
	public void testGetPossibleMarks() {
		assertEquals(100, hw.getPossibleMarks());
	}

	@Test
	public void testSubmitterName() {
		hw.setSubmitterName("Bryan");
		assertEquals("Bryan", hw.getSubmitterName());
	}

	@Test
	public void testGetLetterGrade() {
		hw.setTotalMarks(95);
		hw.getPossibleMarks();
		assertEquals("A", hw.getLetterGrade());
	}

}
