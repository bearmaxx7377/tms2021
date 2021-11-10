import jackets.IJacket;
import pantss.IPants;
import shoess.IShoes;

public class Person {
    private String name; // имя
    private IJacket jacket; // куртка
    private IPants pants; // штаны
    private IShoes shoes; // обувь

    public Person(String name, IJacket jacket, IPants pants, IShoes shoes) {
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

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public void putOnClothes() { // одеть одежду
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void throwOffClothes() { // снять одежду
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
