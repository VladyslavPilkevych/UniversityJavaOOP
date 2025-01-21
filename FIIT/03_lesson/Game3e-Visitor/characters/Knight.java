package characters;

public class Knight implements Energy {
	private int energy;
	private int additionalEnergy;

	protected Weapon weapon;

	public Knight() {
	}

	public Knight(int energy) {
		setEnergy(energy);
	}

	public Knight(int energy, Weapon weapon) {
		setEnergy(energy);
		this.weapon = weapon;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void increaseEnergy(int energy) {
		this.energy += energy;
	}

	public void decreaseEnergy(int energy) {
		this.energy -= energy;
	}

	public int getEnergy() {
		return energy + additionalEnergy;
	}

	public void attack(Ogre ogre) {
		weapon.hit(this, ogre);
		ogre.revenge(this);
	}

	public int showWeapon() { // Renamed from showSword to showWeapon for generalization
		return weapon.getProductNumber();
	}
}
