package game.weapon;

public class CrossBow implements Weapon {
	
	int noOfArrows;
	
	public CrossBow(int number) {
		this.noOfArrows = number;
	}

	@Override
	public void attack() {
		System.out.println("Crossbow attack");
	}

	@Override
	public void defend() {
		System.out.println("Crossbow defend");
	}

}
