package jackets;

public class Jacket implements IJacket {
    public String color;

    public Jacket(String color) { // цвет куртки
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void putOn() {
        System.out.println("!Надеть куртку!");
    }

    @Override
    public void throwOff() {
        System.out.println("!Снять куртку!");
    }
}
