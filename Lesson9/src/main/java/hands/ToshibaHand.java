package hands;

public class ToshibaHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("!Поднял руку Toshiba!");
    }

    @Override
    public int getPrice() {
        return 195;
    }
}
