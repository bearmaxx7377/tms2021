package com.home.model;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

// ЛЕГКОВОЙ
@Getter
@SuperBuilder
public class Passenger extends Ground {

    private String typeBody;         // тип кузова
    private int numberPassengers;    // количество пассажиров

    @Override
    public String toString() {
        return "Легковой: " +
                "Мощность (л/с) - " + getPower() +
                ", Максимальная скорость (км/ч) - " + getMaxSpeed() +
                ", Масса (тонн)- " + getCarWeight() +
                ", Марка - " + getCarBrand() +
                ", Количество колес - " + getNumberWheels() +
                ", Расход топлива (л/100км) - " + getFuelUse() +
                ", Тип кузова - " + getTypeBody() +
                ", Количество пассажиров - " + getNumberPassengers() +
                ", Мощность (кВт) - " + powerKwatt(getPower());
    }

    public void calculRoute(int time) {
        double route = getMaxSpeed() * time;
        System.out.println("За время " + time + " ч, автомобиль " + getCarBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч, проедет " + route + " км " + " и израсходует " + calculFuelUse(route) + " литров топлива.");
    }

    private double calculFuelUse(double route) {
        return (route / 100) * getFuelUse();
    }

}
