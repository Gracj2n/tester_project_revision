package com.tester.abstracts.homework;

public class Circle extends Shape {

    private double r;
    private final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double circuit() {
        return 2 * PI * r;
    }
}
