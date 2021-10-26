package com.home.model;

// ОЩБАК ВСЕГО
public class Transport {

    private int power;        // в л/с
    private int maxSpeed;     // км/ч
    private int carWeight;    // кг
    private String carBrand;  // Ауди, БМВ, и тд

    public Transport(int power, int maxSpeed, int carWeight, String carBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.carWeight = carWeight;
        this.carBrand = carBrand;
    }
}
