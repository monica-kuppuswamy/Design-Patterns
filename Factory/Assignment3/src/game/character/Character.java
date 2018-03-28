package game.character;

import game.factory.WeaponFactory;
import game.weapon.Weapon;

public abstract class Character {
	
	public Weapon weapon;
	public String weaponName;
	
	Character(String name) {
		this.weaponName = name;
	}
	
	public Weapon chooseWeapon(String name) {
		WeaponFactory wf = new WeaponFactory();
		weapon = wf.createWeapon(name);
		return weapon;
	}
}
