package com.tester.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void triangleTests() {
        Triangle triangle = new Triangle(7, 2);
        System.out.println("== Triangle ==");
        System.out.println("Area: " + triangle.area());
        System.out.println("Circuit: " + triangle.circuit());
    }

    @Test
    void rectangleTests() {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("== Rectangle ==");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Circuit: " + rectangle.circuit());
    }

    @Test
    void circleTest() {
        Circle circle = new Circle(2);
        System.out.println("== Circle ==");
        System.out.println("Area: " + circle.area());
        System.out.println("Circuit: " + circle.circuit());
    }

}