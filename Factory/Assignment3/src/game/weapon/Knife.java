package game.weapon;

public class Knife implements Weapon {
	
	int sharpness;
	
	public Knife(int sharpness) {
		this.sharpness = sharpness;
	}

	@Override
	public void attack() {
		System.out.println("Knife Attack");
	}

	@Override
	public void defend() {
		System.out.println("Knife Defend");
	}
}
