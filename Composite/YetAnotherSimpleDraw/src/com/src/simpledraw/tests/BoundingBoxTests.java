package com.src.simpledraw.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.src.simpledraw.BoundingBox;

public class BoundingBoxTests {
	
	BoundingBox b;

	public BoundingBoxTests() {
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setup() {
		b = new BoundingBox(0, 20, 20, 0);
	}
	
	@Test
	public void constructorTest() {
		assertEquals(0, b.topLeftx);
		assertEquals(20, b.topLefty);
		assertEquals(20, b.bottomRightx);
		assertEquals(0, b.bottomRighty);
	}
}
