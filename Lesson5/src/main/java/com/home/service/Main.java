package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.processor = "ATI";
        comp1.ram = 6666;
        comp1.hardDrive = 10000;

        print(comp1);

    }

    private static void print(Computer comp1) {
        System.out.println(comp1.hardDrive + " " + comp1.processor + " " + comp1.ram);
    }
}
