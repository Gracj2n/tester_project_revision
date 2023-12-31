package com.tester.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sum() {
       int result = calculator.sum(5, 55);
       assertEquals(60, result);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(1000, 55);
        assertEquals(945, result);
    }

    @Test
    void toSquare() {
        double result = calculator.toSquare(3, 2);
        double result2 = calculator.toSquare(-2, 3);
        double delta = 0.1;
        assertEquals(9, result, delta);
        assertEquals(-8, result2, delta);
    }
}