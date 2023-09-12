package com.tester.collections.arrays.homework;

import com.tester.collections.interfaces.homework.Bmw;
import com.tester.collections.interfaces.homework.Car;
import com.tester.collections.interfaces.homework.Ford;
import com.tester.collections.interfaces.homework.Opel;

import java.util.Random;



public class CarUtils {

    private static Random random = new Random();

    public static void describeCar(Car car) {
        System.out.println();
        System.out.println("Car model: " + getCarModel(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Increase speed: " + random.nextInt(10) * 10);
    }

    private static String getCarModel(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Bmw)
            return "BMW";
        else
            return "Unknown car model";
    }
}
