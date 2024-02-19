package com.tester.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(20, 0))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
