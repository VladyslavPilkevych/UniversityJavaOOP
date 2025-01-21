
public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}
	static int findEnergyDifference(Energy being1, Energy being2) {
		return being1.getEnergy() - being2.getEnergy();
	}
	
	public static void main(String[] args) {
		Ogre[] o = new Ogre[100];
		Knight[] k = new Knight[100];
		
		for (int i = 0; i < 20; i++) {
			k[i] = new BraveKnight(140, new Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50, true);
		}

		for (int i = 20; i < 40; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new BadOgre();
			o[i].setValues(50);
		}

		for (int i = 40; i < 100; i++) {
			k[i] = new Knight(40, new Sword(i));
			o[i] = new Ogre();
			o[i].setValues(50);
		}
		
		for (int i = 0; i < 100; i++) {
			clash(o[i], k[i]);
			System.out.println(i + ":" + "knight " + k[i].getEnergy() +
					" / " + "ogre " + o[i].getEnergy() + " sword: " + k[i].showSword());

		}
		System.out.println("TotalEnergy: " + countEnergy(o[71], k[11]));
	}

	static int countEnergy(Energy... e) {
		int sumEnergy = 0;
		for (Energy ob : e) {
			sumEnergy += ob.getEnergy();
		}
		return sumEnergy;
	}
}
