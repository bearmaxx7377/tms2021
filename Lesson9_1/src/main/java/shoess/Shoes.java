package shoess;

public class Shoes implements IShoes {
    public int shoeSize;

    public Shoes(int shoeSize) {
        this.shoeSize = shoeSize; // размер обуви
    }

    @Override
    public void putOn() {
        System.out.println("!Одеть обувь!");
    }

    @Override
    public void throwOff() {
        System.out.println("!Снять обувь!");
    }
}
