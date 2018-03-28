package com.src.simpledraw;

import java.util.ArrayList;

public class Group implements IComponent {
	
	BoundingBox b;
	ArrayList<IComponent> shapes = new ArrayList<IComponent>();

	public Group(BoundingBox b) {
		super();
		this.b = b;
	}

	@Override
	public boolean move(int xOffset, int yOffset) {
		System.out.println("\nMoving group by taking x-offset anf y-offset");
		if (xOffset != 0 && yOffset != 0) {
			b.topLeftx += b.topLeftx + xOffset;
			b.topLefty += b.topLefty + yOffset;
			b.bottomRightx += b.bottomRightx + xOffset;
			b.bottomRighty += b.bottomRighty + yOffset;
			System.out.println("New coordinates after moving:");
			System.out.println("Top Left: (" + b.topLeftx + "," + b.topLefty + ")");
			System.out.println("Bottom Right: (" + b.bottomRightx + "," + b.bottomRighty + ")");
			return true;
		} else {
			System.out.println("X and Y offsets should have a positive value");
			return false;
		}

	}

	@Override
	public boolean resize(int xOffset, int yOffset, boolean enlarge) {
		System.out.println("\nResizing Group");
		if (xOffset > 0 && yOffset > 0) {
			if (enlarge) {
				b.topLeftx -= xOffset;
				b.topLefty += yOffset;
			} else {
				b.topLeftx += xOffset;
				b.topLefty -= yOffset;
			}
			System.out.println("New coordinates after resizing:");
			System.out.println("Top Left: (" + b.topLeftx + "," + b.topLefty + ")");
			System.out.println("Bottom Right: (" + b.bottomRightx + "," + b.bottomRighty + ")");
			return true;
		} else {
			System.out.println("X and Y offsets should have a positive value");
			return false;
		}
	}

	@Override
	public boolean duplicate(int xOffset, int yOffset) {
		if (xOffset != 0 && yOffset != 0) { 
			System.out.println("\nDuplicating group with the same coordinate as before and moves it by an offset!");
			BoundingBox b1 = new BoundingBox(b.topLeftx, b.topLefty, b.bottomRightx, b.bottomRighty);
			move(xOffset, yOffset);
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<IComponent> addComponent(IComponent obj) {
		shapes.add(obj);
		return shapes;
	}
	
	public ArrayList<IComponent> removeComponent(IComponent obj) {
		int index = -1;
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).equals(obj) && 
					(shapes.get(i).getClass().getSimpleName().equalsIgnoreCase(obj.getClass().getSimpleName()))) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			shapes.remove(index);
			return shapes;
		} else {
			System.out.println("Shape not found to remove from the group!!");
			return shapes;
		}
	}
}