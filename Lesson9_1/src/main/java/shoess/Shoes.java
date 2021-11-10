package shoess;

public class Shoes implements IShoes {
    public int shoeSize;

    public Shoes(int shoeSize) {
        this.shoeSize = shoeSize; // размер обуви
    }

    @Override
    public void putOn() {
        System.out.println("!Одел обувь " + shoeSize + " размера!");
    }

    @Override
    public void takeOff() {
        System.out.println("!Снял обувь " + shoeSize + " размера!");
    }
}
