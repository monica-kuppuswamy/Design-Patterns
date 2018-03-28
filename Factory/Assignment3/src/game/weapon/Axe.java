package game.weapon;

public class Axe implements Weapon {
	
	int gripLength;
	
	public Axe(int length) {
		this.gripLength = length;
	}

	@Override
	public void attack() {
		System.out.println("Axe Attack");
	}

	@Override
	public void defend() {
		System.out.println("Axe Defend");
	}

}
