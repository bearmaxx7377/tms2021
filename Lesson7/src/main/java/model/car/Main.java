package model.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "blue", "petrol");
        System.out.println("Марка: " + car.getModel() + " | " + "Цвет: " + car.getColor() + " | " + "Двигатель: " + car.getEngine());

        Car car1 = new Car("VW", "black", "diesel");
        System.out.println("Марка: " + car1.getModel() + " | " + "Цвет: " + car1.getColor() + " | " + "Двигатель: " + car1.getEngine());
    }
}
