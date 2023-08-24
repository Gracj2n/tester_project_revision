package com.tester.inheritance.homework;

public class OperatingSystem {

    private final int yearOfPublication;

    public OperatingSystem(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void turnOn() {}

    public void turnOff() {}

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
