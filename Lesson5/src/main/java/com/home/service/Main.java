package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", 1024, 5000, 5);
        String info = computer.info();
        System.out.println(info);

        computer.on();
        computer.off();
        computer.off();
        computer.on();
    }
}
