package hands;

public class SamsungHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("!Поднял руку Samsung!");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}