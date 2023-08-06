package com.tester.leapYear;

public class LeapYear {
    int year;
    public boolean isLeapYear(int year) {
        this.year = year;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}