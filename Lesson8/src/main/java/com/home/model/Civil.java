package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ГРАЖДАНСКИЙ
@Getter
@SuperBuilder
public class Civil extends Air {

    private boolean businessClass;   // наличие бизнес класса (true / false)
    private int numberPassengersAir;    // количество пассажиров

    @Override
    public String toString() {
        return "Гражданский (Авиа): " +
                "Мощность (л/с) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн) - " + getCarWeight() +
                ", Марка - " + getCarBrand() +
                ", Бизнес класс - " + businessClass +
                ", Количество пассажиров - " + numberPassengersAir +
                ", Минимальная длина полосы для взлета - " + getMinLength() +
                ", Размах крыльев (м) - " + getWingspan() +
                ", Мощность (кВт) - " + powerKwatt(getPower());
    }

    public void capacityCivil(int civil) { //вместимость
        System.out.println(numberPassengersAir <= civil ? "!Самолёт загружен!" : "!Необходим самолёт побольше!");
    }
}
