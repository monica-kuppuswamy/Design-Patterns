package com.src.simpledraw.tests;

import static org.junit.Assert.*;

import org.junit.*;
import com.src.simpledraw.*;

public class LineTests {

	public LineTests() {
		// TODO Auto-generated constructor stub
	}
	Line l;
	
	@Before
	public void setup() {
		l = new Line("lefttoright");
		l.drawLine(0, 10, 10, 0);
	}
	
	@Test
	public void moveLine() {
		assertEquals("Move Operation Failed", false, l.move(0, 0));
		assertEquals("Move Operation Successful", true, l.move(5, 5));
	}
	
	@Test 
	public void resizeLine() {
		assertEquals("Resize Operation Failed", false, l.resize(0, 0, true));
		assertEquals("Resize Operation Successful", true, l.resize(2, 2, false));
	}
	
	@Test 
	public void duplicate() {
		assertEquals("Duplicate Operation Failed", false, l.duplicate(0, 0));
		assertEquals("Duplicate Operation Successful", true, l.duplicate(10, 10));
	}
}