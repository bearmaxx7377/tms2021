package com.home.model;

// ЛЕГКОВОЙ
public class Passenger extends Transport {

    private String typeBody;         // тип кузова
    private int numberPassengers;    // количество пассажиров

    public Passenger(int power, int maxSpeed, int carWeight, String carBrand) {
        super(power, maxSpeed, carWeight, carBrand);
    }

    public Passenger(int power, int maxSpeed, int carWeight, String carBrand, String typeBody, int numberPassengers) {
        super(power, maxSpeed, carWeight, carBrand);
        this.typeBody = typeBody;
        this.numberPassengers = numberPassengers;
    }
}
