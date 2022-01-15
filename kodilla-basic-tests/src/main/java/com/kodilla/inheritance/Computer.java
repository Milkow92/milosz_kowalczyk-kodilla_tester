package com.kodilla.inheritance;

import com.kodilla.inheritance.homework.OperatingSystem;

public class Computer extends OperatingSystem {


    public Computer(int year, int systemVersion) {
        super(year, systemVersion);
    }

    @Override
    public void turnOn() {
        System.out.println("computer on");
    }

    @Override
    public void turnOff() {
       System.out.println("computer off");
    }
}
