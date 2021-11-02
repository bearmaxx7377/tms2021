package model.car;

public class PetrolTank {
    private int fullTank;
    private int quantity;

    public PetrolTank(int fullTankPetrol, int quantityFuelNow) {
        this.fullTank = fullTankPetrol; // полный бак
        this.quantity = quantityFuelNow; // кол-во топлива сейчас
    }

    public int getQuantity() {
        return quantity;
    }

    public void calculateConsumptionFuel() { //вычисление потребления топлива
        quantity -= 5;
    }

    public void topUp() {
        quantity = fullTank;
        System.out.println("!Автомобиль заправлен!");
    }

    @Override
    public String toString() {
        return "PetrolTank{" +
                "fullTank=" + fullTank +
                ", quantity=" + quantity +
                '}';
    }
}
