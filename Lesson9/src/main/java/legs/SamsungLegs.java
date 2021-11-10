package legs;

public class SamsungLegs implements ILeg {
    @Override
    public void step() {
        System.out.println("!Сделал шаг Samsung!");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
