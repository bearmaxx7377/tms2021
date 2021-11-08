package pantss;

public class Pants implements IPants {
    public int size;

    public Pants(int size) { // размер брюк
        this.size = size;
    }

    @Override
    public void putOn() {
        System.out.println("!Надеть брюки!");
    }

    @Override
    public void throwOff() {
        System.out.println("!Снять брюки!");
    }
}