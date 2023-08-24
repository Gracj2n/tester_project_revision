package com.tester.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        double result = 15.0;
        assertEquals(result, calculator.add(5, 10));
    }

    @Test
    void sub() {
        double result = -500;
        assertEquals(result, calculator.sub(50, 550));
    }

    @Test
    void circleArea() {
        double result = 314.15927;
        assertEquals(result, calculator.circleArea(10));
    }

    @Test
    void circlePerimeter() {
        double result = 31.415927;
        assertEquals(result, calculator.circlePerimeter(5));
    }
}