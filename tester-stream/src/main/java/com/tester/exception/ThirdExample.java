package com.tester.exception;

import java.sql.SQLOutput;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry this airport is not available");
        } finally {
            System.out.println("Thanks for using our Airlines");
        }
    }
}
