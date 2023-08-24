package com.tester.abstracts.homework;

public class Triangle extends Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a * h) / 2;
    }

    @Override
    public double circuit() {
        double halfA = a / 2;
        double c = Math.sqrt((halfA * halfA) + (h * h));
        return 2 * c + a;
    }
}
