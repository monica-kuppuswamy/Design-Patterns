package game.factory;

import java.util.Scanner;
import game.character.Character;
import game.character.*;

public class CharacterFactory {
	
	public Character createCharacter(String characterName) {
		Character obj = null;
		
		Scanner in = new Scanner(System.in);
		
		switch(characterName.toLowerCase()) {
			case "king": {
				System.out.println("Choose a weapon for the character:");
				System.out.println("CrossBow\nAxe\nKnife\nSword\n");
				String wName = in.nextLine();
				obj = new King("Long Crown", wName);
				break;
			}
			case "queen": {
				System.out.println("Choose a weapon for the character:");
				System.out.println("CrossBow\nAxe\nKnife\nSword\n");
				String wName = in.nextLine();
				obj = new Queen("Diamond Tiara", wName);
				break;
			}
			case "knight": {
				System.out.println("Choose a weapon for the character:");
				System.out.println("CrossBow\nAxe\nKnife\nSword\n");
				String wName = in.nextLine();
				obj = new Knight(50, wName);
				break;
			}
			case "troll": {
				System.out.println("Choose a weapon for the character:");
				System.out.println("CrossBow\nAxe\nKnife\nSword\n");
				String wName = in.nextLine();
				obj = new Troll(wName);
				break;
			}
			default:
				System.out.println("Choose a valid character");
				obj = null;
		}
		return obj;
	}
}
