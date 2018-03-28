/**
 * 
 */
package com.src.simpledraw;

public interface IComponent {
	public boolean move(int xOffset, int yOffset);
	public boolean resize(int xOffset, int yOffset, boolean enlarge);
	public boolean duplicate(int xOffset, int yOffset);
}
