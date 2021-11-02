package model.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "blue", new Engine("Petrol"), new PetrolTank(50, 13));
        System.out.println("Марка: " + car.getModel() + " | " + "Цвет: " + car.getColor() + " | " + "Двигатель: " + car.getEngine() + car.getPetrolTank());

        Car car1 = new Car("VW", "black", new Engine("Diesel"), new PetrolTank(60, 25));
        System.out.println("Марка: " + car1.getModel() + " | " + "Цвет: " + car1.getColor() + " | " + "Двигатель: " + car1.getEngine() + car1.getPetrolTank());

        car.start();
        car.stop();
    }
}
