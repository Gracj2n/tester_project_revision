package com.tester.collections.lists.homework;

import com.tester.collections.arrays.homework.CarUtils;
import com.tester.collections.interfaces.homework.Bmw;
import com.tester.collections.interfaces.homework.Car;
import com.tester.collections.interfaces.homework.Ford;
import com.tester.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();

        Car fordFiesta = new Ford(100);
        Car opelCorsa = new Opel(120);
        Car opelAstra = new Opel(115);
        Car bmwE90 = new Bmw(130);
        Car bmwE46 = new Bmw(125);

        carsList.add(fordFiesta);
        carsList.add(opelCorsa);
        carsList.add(opelAstra);
        carsList.add(bmwE90);
        carsList.add(bmwE46);

        carsList.remove(opelAstra);
        carsList.remove(bmwE90);

        for (Car car : carsList) {
            CarUtils.describeCar(car);
            System.out.println();
            System.out.println("Rozmiar listy: " + carsList.size());
        }
    }
}
