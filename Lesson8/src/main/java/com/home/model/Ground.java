package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// НАЗЕМНЫЙ
@Getter
@SuperBuilder
public class Ground extends Transport {

    private int fuelUse;        // расход топлива (л/100 км)
    private int numberWheels;   // количество колес

    public Ground(int power, int maxSpeed, int carWeight, String carBrand, int fuelUse, int numberWheels) {
        super(power, maxSpeed);
        this.fuelUse = fuelUse;
        this.numberWheels = numberWheels;
    }

    public Ground(int power, int maxSpeed, int carWeight, String carBrand) {
        super(power, maxSpeed);
    }
}
