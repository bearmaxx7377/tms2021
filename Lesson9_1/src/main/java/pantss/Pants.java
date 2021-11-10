package pantss;

public class Pants implements IPants {
    public int size;

    public Pants(int size) { // размер брюк
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("!Надел брюки " + size + " размера!");
    }

    @Override
    public void takeOff() {
        System.out.println("!Снял брюки " + size + " размера!");
    }
}