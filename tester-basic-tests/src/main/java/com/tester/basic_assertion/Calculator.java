package com.tester.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double toSquare(double a, double b) {
        //return a * a;
        return Math.pow(a, b);
    }
}
