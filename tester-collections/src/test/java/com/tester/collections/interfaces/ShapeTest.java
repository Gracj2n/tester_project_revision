package com.tester.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void circleMethodsTests() {
        //given
        Circle circle = new Circle(5);
        //when
        double areaResult = circle.getArea();
        double perimeterResult = circle.getPerimeter();
        //then
        assertEquals(78.53, areaResult, 0.01);
        assertEquals(31.41, perimeterResult, 0.01);
    }

    @Test
    void squareMethodsTests() {
        //given
        Square square = new Square(4);
        //when
        double areaResult = square.getArea();
        double perimeterResult = square.getPerimeter();
        //then
        assertEquals(16, areaResult, 0.01);
        assertEquals(16, perimeterResult, 0.01);
    }

    @Test
    void triangleMethodsTests() {
        //given
        Triangle triangle = new Triangle(5, 4, 3);
        //when
        double areaResult = triangle.getArea();
        double perimeterResult = triangle.getPerimeter();
        //then
        assertEquals(10, areaResult, 0.01);
        assertEquals(11, perimeterResult, 0.01);
    }
}