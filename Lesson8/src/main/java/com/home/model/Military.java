package com.home.model;

// ВОЕННЫЙ
public class Military extends Air {

    private int missile;          // количество ракет на борту
    private boolean catapults;    // наличие системы катапультирования (true / false)

    public Military(int wingspan, int minLength) {
        super(wingspan, minLength);
    }
}
