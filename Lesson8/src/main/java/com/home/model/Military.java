package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ВОЕННЫЙ
@Getter
@SuperBuilder
public class Military extends Air {

    private int missile;          // количество ракет на борту
    private boolean catapults;    // наличие системы катапультирования (true / false)

    public Military(int wingspan, int minLength) {
        super(wingspan, minLength);
    }

    @Override
    public String toString() {
        return "Военный (Авиа): " +
                "Мощность (л/с) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн) - " + getCarWeight() +
                ", Марка - " + getCarBrand() +
                ", Количество ракет на борту - " + missile +
                ", Наличие системы катапультирования - " + catapults +
                ", Минимальная длина полосы для взлета - " + getMinLength() +
                ", Размах крыльев (м) - " + getWingspan() +
                ", Мощность (кВт) - " + powerKwatt(getPower());
    }

    public void shotMissile() {
        if (missile > 0) {
            missile--;
            System.out.println("!Снаряд ушёл!");
        } else {
            System.out.println("!Снаряды отсутствуют!");
        }
    }
}