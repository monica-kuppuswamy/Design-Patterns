package com.src.simpledraw;

public class Ellipse implements IComponent {
	
	BoundingBox b;

	public Ellipse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean move(int xOffset, int yOffset) {
		if (xOffset != 0 && yOffset != 0) {
			System.out.println("\nMoving the ellipse by taking x-offset anf y-offset...");
			b.topLeftx += b.topLeftx + xOffset;
			b.topLefty += b.topLefty + yOffset;
			b.bottomRightx += b.bottomRightx + xOffset;
			b.bottomRighty += b.bottomRighty + yOffset;
			System.out.println("New coordinates after moving:");
			System.out.println("Top Left: (" + b.topLeftx + "," + b.topLefty + ")");
			System.out.println("Bottom Right: (" + b.bottomRightx + "," + b.bottomRighty + ")");
			return true;
		} else {
			System.out.println("\nX and Y offsets cannot be zero for moving");
			return false;
		}
	}

	@Override
	public boolean resize(int xOffset, int yOffset, boolean enlarge) {
		if (xOffset > 0 && yOffset > 0) {
			System.out.println("\nResizing Ellipse...");
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
			System.out.println("\nX and Y offsets should have a positive value for resizing");
			return false;
		}
	}

	@Override
	public boolean duplicate(int xOffset, int yOffset) {
		if (xOffset != 0 && yOffset != 0) { 
			System.out.println("\nDuplicating ellipse draws another bounding box with the same coordinate as before and moves it by an offset!");
			drawEllipse(b.topLeftx, b.topLefty, b.bottomRightx, b.bottomRighty);
			move(xOffset, yOffset);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean drawEllipse(int tx, int ty, int bx, int by) {
		b = new BoundingBox(tx, ty, bx, by);
		System.out.println("Drawing Ellipse inside the bounding box");
		return true;
	}

}
