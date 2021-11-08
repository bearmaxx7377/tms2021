import jackets.Jacket;
import pantss.Pants;
import shoess.Shoes;

public class Clothes {
    public static void main(String[] args) {

        Person person1 = new Person("Дмитрий", new Jacket("black"), new Pants(50), new Shoes(43));
        Person person2 = new Person("Phil", new Jacket("blue"), new Pants(54), new Shoes(45));

        person1.putOnClothes();
        person1.throwOffClothes();
    }
}