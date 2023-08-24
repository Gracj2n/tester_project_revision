package com.tester.inheritance.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTest {

    @Test
    void launch() {
        WindowsSystem windows11 = new WindowsSystem(2021);
        MacOsSystem ventura13 = new MacOsSystem(2022);

        System.out.println("============================================");

        windows11.turnOn();
        System.out.println("Year of Windows 11 publication: " + windows11.getYearOfPublication());
        windows11.turnOff();

        System.out.println("============================================");

        ventura13.turnOn();
        System.out.println("Year of Ventura publication: " + ventura13.getYearOfPublication());
        ventura13.turnOff();

        System.out.println("============================================");

    }

}