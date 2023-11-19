package com.tester.exception.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parking {

    List<Car> carsOnParking = new ArrayList<>();

    public void addCarToParking(Car carPlate) {
        this.carsOnParking.add(carPlate);
    }

    public List<Car> getCarFromParking(String plateNumber) throws CarIsNotOnParkingException {
        List<Car> filteredListByPlateNumber = carsOnParking.stream()
                .filter(c -> c.getPlateNumberl().equals(plateNumber))
                .collect(Collectors.toList());
        if (filteredListByPlateNumber.size() == 0) {
            throw new CarIsNotOnParkingException();
        }
        return filteredListByPlateNumber;
    }
}
