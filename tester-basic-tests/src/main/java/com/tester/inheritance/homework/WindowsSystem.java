package com.tester.inheritance.homework;

public class WindowsSystem extends OperatingSystem {

    public WindowsSystem(int yearOfPublication) {
        super(yearOfPublication);
    }

    @Override
    public void turnOn() {
        System.out.println("WINDOWS 11 is starting...");
    }

    @Override
    public void turnOff() {
        System.out.println("WINDOWS 11 is closing...");
    }
}
