package com.tester.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {

    private double value;

    public double display(double value) {
        return value;
    }
}
