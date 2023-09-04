package com.tester.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car bmw = new Bmw(120);
        Car ford = new Ford(100);
        Car opel = new Opel(110);

        System.out.println("BMW:");
        doRace(bmw);

        System.out.println("Ford:");
        doRace(ford);

        System.out.println("Opel:");
        doRace(opel);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
    }
}
