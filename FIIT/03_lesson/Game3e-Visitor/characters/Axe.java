package characters;

public class Axe implements Weapon {
    private int productNumber;

    public Axe(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public void hit(Knight knight, Ogre ogre) {
        System.out.println("Knight " + knight.showSword() + " hits Ogre " + ogre.showWeapon());
    }

    @Override
    public int getProductNumber() {
        return productNumber;
    }
}
