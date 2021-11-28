package com.kodilla.abstracts;

import com.kodilla.inheritance.Car;

public abstract class Animals {
    private int numberOfLegs;

    public Animals(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void Dog(int numberOfLegs) {
        this.numberOfLegs = 4;
    }

    public void Duck(int numberOfLegs) {
        this.numberOfLegs = 2;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void giveVoice();
}

