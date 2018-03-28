package com.src.simpledraw;

public class DrawClient {

	public DrawClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		// Drawing a circle using Ellipse with appropriate coordinates
		IComponent circle = sf.createComponent("ellipse");
		((Ellipse) circle).drawEllipse(0, 10, 10, 0);
		
		// Drawing a rectangle using appropriate coordinates
		IComponent rectangle = sf.createComponent("rectangle");
		((Rectangle) rectangle).drawRectangle(0, 5, 7, 0);
		
		IComponent group = sf.createComponent("group");
		((Group) group).addComponent(circle);
		((Group) group).addComponent(rectangle);
		group.move(5,5);
	}
}
