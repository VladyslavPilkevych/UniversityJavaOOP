package characters;

public abstract class Weapon {
    protected int productNumber;

    public Weapon(int productNumber) {
        this.productNumber = productNumber;
    }

    public abstract void hit(Knight knight, Ogre ogre);

    public int getProductNumber() {
        return productNumber;
    }
}
