package com.src.simpledraw.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.src.simpledraw.BoundingBox;
import com.src.simpledraw.Ellipse;
import com.src.simpledraw.Group;
import com.src.simpledraw.IComponent;
import com.src.simpledraw.Line;
import com.src.simpledraw.Rectangle;

public class GroupTests {

	public GroupTests() {
		// TODO Auto-generated constructor stub
	}
	
	private Group g;
	private Line l;
	private Ellipse e;
	private Rectangle r;
	
	@Before
	public void setup() {
		BoundingBox b = Mockito.mock(BoundingBox.class);
		g = new Group(b);
		l = Mockito.mock(Line.class);
		e = Mockito.mock(Ellipse.class);
		r = Mockito.mock(Rectangle.class);
	}
	
	@Test
	public void moveGroup() {
		assertFalse(g.move(0, 0));
		assertTrue(g.move(5, 5));
	}
	
	@Test 
	public void resizeGroup() {
		assertFalse(g.resize(0, 0, true));
		assertTrue(g.resize(4, 4, false));
	}
	
	@Test 
	public void duplicateGroup() {
		assertFalse(g.duplicate(0, 0));
		assertTrue(g.duplicate(5, 5));
	}
	
	@Test
	public void addComponentTest() {
		ArrayList<IComponent> shapes = new ArrayList<IComponent>();
		shapes = g.addComponent(l);
		shapes = g.addComponent(e);
		shapes = g.addComponent(r);
		assertEquals(3, shapes.size());
	}
	
	@Test
	public void removeComponent() {
		ArrayList<IComponent> shapes = new ArrayList<IComponent>();
		shapes = g.addComponent(l);
		shapes = g.addComponent(e);
		shapes = g.addComponent(r);
		shapes = g.removeComponent(r);
		assertEquals(2, shapes.size());
		
		shapes = g.removeComponent(null);
		assertEquals(2, shapes.size());
	}
}