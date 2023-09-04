package com.tester.collections.interfaces.homework;

public class Opel implements Car {

    int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 45;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;
        System.out.println(speed);
    }
}
