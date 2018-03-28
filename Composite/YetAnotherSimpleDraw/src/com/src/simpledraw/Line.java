package com.src.simpledraw;

public class Line implements IComponent {
	
	String lineDirection;
	BoundingBox b; 

	/**
	 * Constructor to create a line object with the specified direction
	 * @param lineDirection
	 */
	public Line(String lineDirection) {
		this.lineDirection = lineDirection;
	}

	@Override
	public boolean move(int xOffset, int yOffset) {
		System.out.println("\nMoving the line by taking x-offset anf y-offset");
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
			System.out.println("\nX and Y offsets cannot be zero for moving");
			return false;
		}
	}

	@Override
	public boolean resize(int xOffset, int yOffset, boolean enlarge) {
		System.out.println("\nResizing Line");
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
			System.out.println("\nX and Y offsets should have a positive value");
			return false;
		}
	}

	@Override
	public boolean duplicate(int xOffset, int yOffset) {
		if (xOffset != 0 && yOffset != 0) { 
			System.out.println("\nDuplicating line draws another bounding box and line with the same coordinate as before and moves" 
					+ "it by an offset!");
			drawLine(b.topLeftx, b.topLefty, b.bottomRightx, b.bottomRighty);
			move(xOffset, yOffset);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean drawLine(int tx, int ty, int bx, int by) {
		b = new BoundingBox(tx, ty, bx, by);
		System.out.println("Drawing line in the direction: " + this.lineDirection);
		return true;
	}
}