package model.car;

public class Car {
    private String model;
    private String color;
    private final Engine engine;
    private final PetrolTank petrolTank;

    public Car(String model, String color, Engine engine, PetrolTank petrolTank) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.petrolTank = petrolTank;
    }

    public void start() {
        if (!engine.startEngine()) {
            System.out.println("Нельзя запустить без топлива!!!");
        } else {
            System.out.println("Машина запущена!");
        }
    }

    public void stop() {
        if (!engine.startEngine()) {
        } else {
            engine.stopEngine();
            System.out.println("!С Т О П!");
        }
    }

    public PetrolTank getPetrolTank() {
        return petrolTank;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void check() {
        System.out.println("Проверить двигатель: ");
    }

}
