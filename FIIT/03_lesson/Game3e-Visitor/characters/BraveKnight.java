package characters;

public class BraveKnight extends Knight {

	public BraveKnight() {
		super();
	}
	public BraveKnight(int energy) {
		super(energy);
	}
	public BraveKnight(int energy, Weapon sword) {
		super(energy, sword);
	}
	
	public void attack(Ogre ogre) {
		Axe sword = null;
		sword.hit(this, ogre);
	}
}
