package com.tester.abstracts.homework;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circuit() {
        return 2 * a + 2 * b;
    }
}
