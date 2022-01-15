package com.kodilla.inheritance;

import com.kodilla.inheritance.homework.Laptop;

public class Application {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());

        Laptop laptop = new Laptop(2021, 10);
        laptop.turnOff();

        Computer computer = new Computer(2019, 11);
        computer.turnOn();


    }


}


