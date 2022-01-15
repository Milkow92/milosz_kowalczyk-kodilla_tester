package com.kodilla.inheritance.homework;

public class Laptop extends OperatingSystem {


    public Laptop(int year, int systemVersion) {
        super(year, systemVersion);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop off");
    }
}
