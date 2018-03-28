package game.encounter;

import game.factory.CharacterFactory;
import game.character.Character;

public class Person {
	
	public Character character;
	public String characterName;
	
	public Character chooseCharacter(String name) {
		this.characterName = name;
		CharacterFactory cf = new CharacterFactory();
		character = cf.createCharacter(name);
		return character;
	}
}
