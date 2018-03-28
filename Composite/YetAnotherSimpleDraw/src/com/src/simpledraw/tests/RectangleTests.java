package com.src.simpledraw.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.src.simpledraw.Rectangle;

public class RectangleTests {

	public RectangleTests() {
		// TODO Auto-generated constructor stub
	}

	Rectangle r;
	
	@Before
	public void setup() {
		r = new Rectangle();
		r.drawRectangle(0, 15, 15, 0);
	}
	
	@Test
	public void moveRectangle() {
		assertEquals("Move Operation Failed", false, r.move(0, 0));
		assertEquals("Move Operation Successful", true, r.move(2, 2));
	}
	
	@Test 
	public void resizeRectangle() {
		assertEquals("Resize Operation Failed", false, r.resize(0, 0, true));
		assertEquals("Resize Operation Successful", true, r.resize(5, 4, false));
	}
	
	@Test 
	public void duplicateRectangle() {
		assertEquals("Duplicate Operation Failed", false, r.duplicate(0, 0));
		assertEquals("Duplicate Operation Successful", true, r.duplicate(5, 5));
	}
}
