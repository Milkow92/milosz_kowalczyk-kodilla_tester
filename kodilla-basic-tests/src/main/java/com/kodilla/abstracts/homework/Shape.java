package com.kodilla.abstracts.homework;

public abstract class Shape {

    public int polePowierzchni;
    public int obwod;



    public Shape(int polePowierzchni, int obwod) {
        this.polePowierzchni = polePowierzchni;
        this.obwod = obwod;
    }

    public int obliczPolePowerzchni() {
        return polePowierzchni;
    }
public int obliczObwod(){
        return obwod;
}

}

