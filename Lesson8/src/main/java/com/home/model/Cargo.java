package com.home.model;

// ГРУЗОВОЙ
public class Cargo extends Transport {

    private int tonnage;   // грузоподъемность (т)

    public Cargo(int power, int maxSpeed, int carWeight, String carBrand) {
        super(power, maxSpeed, carWeight, carBrand);
    }

    public Cargo(int power, int maxSpeed, int carWeight, String carBrand, int tonnage) {
        super(power, maxSpeed, carWeight, carBrand);
        this.tonnage = tonnage;
    }
}
