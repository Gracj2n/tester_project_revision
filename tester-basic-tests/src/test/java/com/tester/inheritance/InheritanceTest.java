package com.tester.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
    Car car = new Car(4, 5);
    Convertible  convertible = new Convertible(4, 2);

    @Test
    void launch() {
        System.out.println("Car seats: " + car.getSeats());
        System.out.println("Car wheels: " + car.getWheels());
        System.out.println("Cabrio seats: " + convertible.getSeats());
        System.out.println("Cabrio wheels: " + convertible.getWheels());

    }
}