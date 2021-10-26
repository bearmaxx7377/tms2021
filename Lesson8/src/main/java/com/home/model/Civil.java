package com.home.model;

// ГРАЖДАНСКИЙ
public class Civil extends Air {

    private boolean businessClass;   // наличие бизнес класса (true / false)
    private int numberPassengersAir;    // количество пассажиров

    public Civil(int wingspan, int minLength) {
        super(wingspan, minLength);
    }
}
