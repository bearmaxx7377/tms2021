package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// НАЗЕМНЫЙ
@Getter
@SuperBuilder
public class Ground extends Transport {

    private int fuelUse;        // расход топлива (л/100 км)
    private int numberWheels;   // количество колес
}
