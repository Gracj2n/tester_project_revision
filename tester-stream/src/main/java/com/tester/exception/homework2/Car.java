package com.tester.exception.homework2;

public class Car {
    String plate;

    public Car(String plate) {
        this.plate = plate;
    }

    public String getPlateNumberl() {
        return plate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + plate + '\'' +
                '}';
    }
}
