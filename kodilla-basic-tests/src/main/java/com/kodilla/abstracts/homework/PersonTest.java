package com.kodilla.abstracts.homework;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("John", 32,new Lawyer());
        person1.showResponsibilities();

        Person person2  = new Person("Mark", 40, new Doctor());
        person2.showResponsibilities();
    }
}
