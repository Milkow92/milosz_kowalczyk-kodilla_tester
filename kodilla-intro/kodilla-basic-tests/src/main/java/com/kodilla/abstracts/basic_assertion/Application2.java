package com.kodilla.abstracts.basic_assertion;

public class Application2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawniedla liczb" + a + " i " + b);
        } else {
            System.out.println("Metoda nie daiała poprawnie dla liczb" + a + " i " + b);
        }
    }
}
