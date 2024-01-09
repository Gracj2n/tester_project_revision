package com.tester.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final ApplicationContext context = new AnnotationConfigApplicationContext("com.tester.spring.basic");
    private final Calculator calculatorBean = context.getBean(Calculator.class);

    @ParameterizedTest
    @CsvSource(value = {"5, 10, 15", "20, 5100, 5120", "0, 9, 9"})
    void add(double num_a, double num_b, double expected) {
        double addMethod = calculatorBean.add(num_a, num_b);
        assertEquals(expected, addMethod);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 10, -5", "0, 100, -100", "10, 0, 10"})
    void subtract(double num_a, double num_b, double expected) {
        double subtractMethod = calculatorBean.subtract(num_a, num_b);
        assertEquals(expected, subtractMethod);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 10, 50", "0, 0, 0", "0, 65, 0", "5, -20, -100"})
    void multiply(double num_a, double num_b, double expected) {
        double multiplyMethod = calculatorBean.multiply(num_a, num_b);
        assertEquals(expected, multiplyMethod);
    }

    @ParameterizedTest
    @CsvSource(value = {"5, 10, 0.5", "0, 5, 0", "-10, -1, 10"})
    void divide(double num_a, double num_b, double expected) {
        double divideMethod = calculatorBean.divide(num_a, num_b);
        assertEquals(expected, divideMethod);
    }

    @Test
    void divideByZero() {
        double divideByZeroMethod = calculatorBean.divide(5, 0);
        assertTrue(Double.isNaN(divideByZeroMethod));
    }
}