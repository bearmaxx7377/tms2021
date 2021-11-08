package legs;

public class ToshibaLegs implements ILeg {
    @Override
    public void step() {
        System.out.println("!Сделал шаг Toshiba!");
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
