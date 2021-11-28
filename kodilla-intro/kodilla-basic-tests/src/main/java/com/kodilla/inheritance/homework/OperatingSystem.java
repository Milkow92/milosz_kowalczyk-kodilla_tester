package com.kodilla.inheritance.homework;

public class OperatingSystem {
  private int year;
  private int systemVersion;

  public void computer(int year, int systemVersion){
      this.year = year;
      this.systemVersion = systemVersion;
  }

public void laptop(int year, int systemVersion){
      this.year = year;
      this.systemVersion = systemVersion;
}

  public static void turnOn(){
      System.out.println("your System is on");
  }
public static void turnOff(){
      System.out.println("your system is off");
}
}
