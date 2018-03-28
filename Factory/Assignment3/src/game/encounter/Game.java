package game.encounter;

import java.util.Scanner;

import game.character.Character;
import game.weapon.Weapon;

public class Game {
	
	public void display(Person p, Character c) {
		Weapon w = c.chooseWeapon(c.weaponName);
		if (w != null) { 
			System.out.println("Chosen Character: " + p.characterName);
			System.out.println("Chosen Weapon: " + c.weaponName);
			System.out.println("Weapon Functions: ");
			w.attack();
			w.defend();
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		Game g = new Game();
		String choice =  null;
		
		System.out.println("Choose a character for the person:");
		System.out.println("King\nQueen\nKnight\nTroll\n");
		String cName = in.nextLine();
		Person p = new Person();
		Character c = p.chooseCharacter(cName);
		if (c != null) {
			g.display(p,c);
			System.out.println("Do you want to change weapon? Yes/No");
			choice = in.nextLine();
			while(choice.equalsIgnoreCase("yes")) {
				System.out.println("Choose a new weapon for the character: ");
				System.out.println("CrossBow\nAxe\nKnife\nSword\n");
				String newWeapon = in.nextLine();
				c.weaponName = newWeapon;
				g.display(p, c);
				System.out.println("\nDo you want to change weapon? Yes/No");
				choice = in.nextLine();
			}
		} else {
			System.exit(0);
		}
		in.close();
	}
}