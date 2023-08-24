package com.tester.calculator;

public class Calculator {
    static final double PI = 3.1415927;
    static int counter;
    public Calculator() {
        counter++;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius cannot be 0 or less");
        }
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius cannot be 0 or less");
        }
        return 2 * PI *r;
    }
}