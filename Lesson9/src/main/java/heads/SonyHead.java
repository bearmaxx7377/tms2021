package heads;

public class SonyHead implements IHead {
    @Override
    public void speak() {
        System.out.println("!Привет, я голова Sony!");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
