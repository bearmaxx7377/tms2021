package com.home.service;

import com.home.model.Cargo;
import com.home.model.Civil;
import com.home.model.Military;
import com.home.model.Passenger;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = Passenger.builder()
                .power(110)
                .carBrand("Audi")
                .carWeight(1350)
                .maxSpeed(187)
                .fuelUse(9)
                .numberWheels(4)
                .numberPassengers(5)
                .typeBody("sedan")
                .build();

        Cargo cargo = Cargo.builder()
                .power(370)
                .carBrand("MANN")
                .carWeight(4000)
                .maxSpeed(135)
                .fuelUse(300)
                .numberWheels(10)
                .tonnage(15)
                .build();
        Civil civil = Civil.builder()
                .power(700)
                .maxSpeed(570)
                .carWeight(50)
                .carBrand("ТУ-134")
                .wingspan(20)
                .minLength(2000)
                .numberPassengersAir(70)
                .businessClass(true)
                .build();

        Military military = Military.builder()
                .power(500)
                .maxSpeed(2450)
                .carWeight(18)
                .carBrand("МиГ-29")
                .wingspan(23)
                .minLength(1000)
                .catapults(true)
                .missile(6)
                .build();

        System.out.println(passenger);
        System.out.println(cargo);
        System.out.println(civil);
        System.out.println(military);
        System.out.println();

        passenger.calculRoute(4);
        cargo.capacityCargo(15);
        civil.capacityCivil(70);
        military.shotMissile();
    }
}
