package game.weapon;

public class Sword implements Weapon {
	
	int swordLength;
	
	public Sword(int length) {
		this.swordLength = length;
	}

	@Override
	public void attack() {
		System.out.println("Sword Attack");
	}

	@Override
	public void defend() {
		System.out.println("Sword Defend");
	}

}
