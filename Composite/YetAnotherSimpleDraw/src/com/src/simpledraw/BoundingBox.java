package com.src.simpledraw;

public class BoundingBox {
	
	public int topLeftx;
	public int topLefty;
	public int bottomRightx;
	public int bottomRighty;
	
	/**
	 * Constructor to create bounding box with top left and bottom right coordinates
	 * @param topLeftx
	 * @param topLefty
	 * @param bottomRightx
	 * @param bottomRighty
	 */
	public BoundingBox(int topLeftx, int topLefty, int bottomRightx, int bottomRighty) {
		super();
		this.topLeftx = topLeftx;
		this.topLefty = topLefty;
		this.bottomRightx = bottomRightx;
		this.bottomRighty = bottomRighty;
		System.out.println("\nDrawing bounding box with the coordinates: (" + topLeftx + ", " + topLefty + ") and " +
				"(" + bottomRightx + ", " + bottomRighty + ")");
	}
}