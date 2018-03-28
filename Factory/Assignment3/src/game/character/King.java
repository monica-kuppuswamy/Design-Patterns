package game.character;

public class King extends Character {
	
	public String crownType;

	public King(String crown, String weapon) {
		super(weapon);
		this.crownType = crown;
	}
	
}
