package game.factory;

import game.weapon.Axe;
import game.weapon.CrossBow;
import game.weapon.Knife;
import game.weapon.Sword;
import game.weapon.Weapon;

public class WeaponFactory {	
	
	public Weapon createWeapon(String weaponName) {
		Weapon obj = null;
		
		switch(weaponName.toLowerCase()) {
			case "axe": {
				obj = new Axe(20);
				break;
			}
			case "sword": {
				obj = new Sword(15);
				break;
			}
			case "crossbow": {
				obj = new CrossBow(50);
				break;
			}
			case "knife": {
				obj = new Knife(8);
				break;
			}
			default:
				System.out.println("Choose a valid weapon");
				obj = null;
		}
		return obj;
	}
}
