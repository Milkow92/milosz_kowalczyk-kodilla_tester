package com.kodilla.inheritance;

import com.kodilla.inheritance.homework.OperatingSystem;

public class Computer extends OperatingSystem {

    public static void main(String[] args) {

        Computer computer = new Computer(2021, 11);

        Computer.turnOn();
        Computer.turnOff();

    }
}
