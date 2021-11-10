package legs;

public class SonyLegs implements ILeg {
    @Override
    public void step() {
        System.out.println("!Сделал шаг Sony!");
    }

    @Override
    public int getPrice() {
        return 170;
    }
}
