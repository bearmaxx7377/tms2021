package com.home.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

// ОБЩАК ВСЕГО

@Getter
@Setter
@SuperBuilder
public class Transport {

    private int power;        // в л/с
    private int maxSpeed;     // км/ч
    private int carWeight;    // вес авто (кг)
    private String carBrand;  // Ауди, БМВ, и тд

    protected double powerKwatt(int power) {
        return power * 0.74;
    }
}