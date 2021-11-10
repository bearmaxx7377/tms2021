package heads;

public class SamsungHead implements IHead {
    @Override
    public void speak() {
        System.out.println("!Привет, я голова Samsung!");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
