package com.src.simpledraw.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.src.simpledraw.Ellipse;

public class EllipseTests {

	public EllipseTests() {
		// TODO Auto-generated constructor stub
	}
	
	private Ellipse el;
	
	@Before
	public void setup() {
		el = new Ellipse();
		el.drawEllipse(0, 6, 7, 0);
	}
	
	@Test
	public void moveEllipse() {
		assertFalse(el.move(0, 0));
		assertTrue(el.move(5, 5));
	}
	
	@Test 
	public void resizeEllipse() {
		assertFalse(el.resize(0, 0, true));
		assertTrue(el.resize(4, 4, false));
	}
	
	@Test 
	public void duplicateEllipse() {
		assertFalse(el.duplicate(0, 0));
		assertTrue(el.duplicate(5, 5));
	}

}