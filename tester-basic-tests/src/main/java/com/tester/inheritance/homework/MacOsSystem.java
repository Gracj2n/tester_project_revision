package com.tester.inheritance.homework;

public class MacOsSystem extends OperatingSystem {

    public MacOsSystem(int yearOfPublication) {
        super(yearOfPublication);
    }

    @Override
    public void turnOn() {
        System.out.println("MacOs is starting...");
    }

    @Override
    public void turnOff() {
        System.out.println("MacOs is closing...");
    }
}
