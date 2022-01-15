package com.kodilla.abstracts.basic_assertion;

public class Application3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;

        int involutionResult = calculator.involution(a);
        boolean correct = ResultChecker.assertEquals(25, involutionResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczby " + a );
        }
    }
}

