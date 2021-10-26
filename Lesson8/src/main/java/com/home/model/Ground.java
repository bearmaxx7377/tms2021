package com.home.model;

// НАЗЕМНЫЙ
public class Ground extends Transport {

    private int fuelUse;        // расход топлива (л/100 км)
    private int numberWheels;   // количество колес

    public Ground(int power, int maxSpeed, int carWeight, String carBrand) {
        super(power, maxSpeed, carWeight, carBrand);
    }

    public Ground(int power, int maxSpeed, int carWeight, String carBrand, int fuelUse, int numberWheels) {
        super(power, maxSpeed, carWeight, carBrand);
        this.fuelUse = fuelUse;
        this.numberWheels = numberWheels;
    }
}
