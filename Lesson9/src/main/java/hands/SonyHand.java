package hands;

public class SonyHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("!Поднял руку Sony!");
    }

    @Override
    public int getPrice() {
        return 270;
    }
}
