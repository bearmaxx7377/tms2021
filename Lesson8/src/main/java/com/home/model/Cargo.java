package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ГРУЗОВОЙ
@Getter
@SuperBuilder
public class Cargo extends Ground {

    private int tonnage;   // грузоподъемность (т)

    @Override
    public String toString() {
        return "Грузовой: " +
                "Мощность (л/с) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getCarWeight() +
                ", Марка - " + getCarBrand() +
                ", Количество колес - " + getNumberWheels() +
                ", Расход топлива (л/100км) - " + getFuelUse() +
                ", Грузоподъёмность(т) - " + tonnage +
                ", Мощность (кВт) - " + powerKwatt(getPower());
    }

    public void capacityCargo(int cargo) {
        System.out.println(tonnage <= cargo ? "!Грузовик загружен!" : "!Необходим грузовик побольше!");
    }
}
