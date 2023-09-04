package com.tester.collections.interfaces.homework;

public class Bmw implements Car {

    int speed;

    public Bmw(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 40;
        System.out.println(speed);
    }
}
