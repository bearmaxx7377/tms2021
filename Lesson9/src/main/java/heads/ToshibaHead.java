package heads;

public class ToshibaHead implements IHead {
    @Override
    public void speak() {
        System.out.println("!Привет, я голова Toshiba!");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
