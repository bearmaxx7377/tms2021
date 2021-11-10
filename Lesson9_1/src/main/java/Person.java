import jackets.Jacket;
import pantss.Pants;
import shoess.Shoes;

public class Person {
    private String name; // имя
    private Jacket jacket; // куртка
    private Pants pants; // штаны
    private Shoes shoes; // обувь

    public Person(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void putOnClothes() { // одеть одежду
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void throwOffClothes() { // снять одежду
        jacket.throwOff();
        pants.throwOff();
        shoes.throwOff();
    }
}
