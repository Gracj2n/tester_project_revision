package com.tester.collections.interfaces.homework;

public class Ford implements Car {

    int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 35;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed -= 25;
        System.out.println(speed);
    }
}
