package com.tester.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 10;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(15, sumResult);

        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda NiE działa poprawnie dla liczb: " + a + " " + b);
        }
    }
}
