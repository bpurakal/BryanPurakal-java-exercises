package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	private FruitTree tree;
	
	@Before
	public void setUp() throws Exception {
		tree = new FruitTree("Apple", 10); // Arrange
	}

	@Test
	public void testFruitTree() {
		assertNotNull(tree);
	}

	@Test
	public void testGetTypeOfFruit() {
		assertEquals("Apple", tree.getTypeOfFruit());
	}

	@Test
	public void testGetPiecesOfFruitLeft() {
		assertEquals(10, tree.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickFruitDoesNotAllowNegatives() {
		boolean result = tree.PickFruit(-1); //Act 
		assertEquals(false, result); //assert
		assertEquals(10, tree.getPiecesOfFruitLeft());//assert
	}

}
