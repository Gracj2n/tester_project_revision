package com.tester.collections.arrays.homework;

import com.tester.collections.interfaces.homework.Bmw;
import com.tester.collections.interfaces.homework.Car;
import com.tester.collections.interfaces.homework.Ford;
import com.tester.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] carsTable = new Car[RANDOM.nextInt(15) + 1];
        for (int i = 0; i < carsTable.length; i++) {
            carsTable[i] = drawCar();
        }
        for (Car car : carsTable) {
            CarUtils.describeCar(car);
        }

        System.out.println();
        System.out.println("Liczba wyloswanych pojazdów: " + carsTable.length);
    }

    public static Car drawCar() {
        int drawnCarModel = RANDOM.nextInt(3);

        int speed = getRandomSpeed();
        if (drawnCarModel == 0)
            return new Ford(speed);
        if (drawnCarModel == 1)
            return new Opel(speed);
        else
            return new Bmw(speed);
    }

    private static int getRandomSpeed() {
        return RANDOM.nextInt(10) * 30 + 1;
    }
}
