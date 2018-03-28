package com.src.simpledraw;

import java.util.Scanner;

public class ShapeFactory {

	Scanner in = new Scanner(System.in);
	
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public IComponent createComponent(String componentName) {
		IComponent component = null;
		
		
		switch(componentName.toLowerCase()) {
			case "line":
				Scanner in = new Scanner(System.in);
				System.out.println("Specify the direction in which the line should be drawn: ");
				String direction = in.nextLine();
				component = new Line(direction);
				in.close();
			break;
		
			case "ellipse":
				component = new Ellipse();
			break;
		
			case "rectangle":
				component = new Rectangle();
			break;
			
			case "group": 
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter top left x coordinate: ");
				int tx = ip.nextInt();
				System.out.println("Enter top left y coordinate: ");
				int ty = ip.nextInt();
				System.out.println("Enter bottom right x coordinate: ");
				int bx = ip.nextInt();
				System.out.println("Enter bottom right y coordinate: ");
				int by = ip.nextInt();
				BoundingBox b = new BoundingBox(tx, ty, bx, by);
				component = new Group(b);
				ip.close();
			break;	
			
		}
		return component;
	}
}
