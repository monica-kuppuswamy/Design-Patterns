package game.character;

public class Knight extends Character {
	
	public int armourStrength;

	public Knight(int strength, String weapon) {
		super(weapon);
		this.armourStrength = strength;
	}

}
