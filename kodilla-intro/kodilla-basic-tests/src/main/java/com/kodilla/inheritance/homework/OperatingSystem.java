package com.kodilla.inheritance.homework;

public class OperatingSystem {
  private int year;
  private int systemVersion;

    public OperatingSystem(int year, int systemVersion) {
        this.year = year;
        this.systemVersion = systemVersion;
    }

    public void turnOn(){
      System.out.println("your System is on");
  }
public void turnOff(){
      System.out.println("your system is off");
}
}
