package com.tester.exception.homework2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {

    //given
    Parking parking = new Parking();

    @BeforeEach
    void setup() {
        //given
        parking.addCarToParking(new Car("WI C2NZK"));
        parking.addCarToParking(new Car("WN 53OLP"));
        parking.addCarToParking(new Car("WP D3D46"));
        parking.addCarToParking(new Car("WS KOL2D"));
    }

    @Test
    void getExistCarFromParking() {
        try {
            System.out.println(parking.getCarFromParking("WN 53OLP"));
        } catch (CarIsNotOnParkingException e) {
            System.out.println("There is no car with entered number plate");
        }
    }

    @Test
    void getNonExistCarFromParking() {
        try {
            System.out.println(parking.getCarFromParking("XYZ"));
        } catch (CarIsNotOnParkingException e) {
            System.out.println("There is no car with entered number plate");
        }
    }

    @Test
    void getNonExistCarFromParking_withException() {
        assertThrows(CarIsNotOnParkingException.class, () -> parking.getCarFromParking("XYZ"));
    }
}