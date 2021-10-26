package com.home.model;

// ВОЗДУШНЫЙ
public class Air {

    private int wingspan;     // размах крыльев (м)
    private int minLength;    // минимальная длина полосы для взлета

    public Air(int wingspan, int minLength) {
        this.wingspan = wingspan;
        this.minLength = minLength;
    }
}
