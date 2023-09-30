package com.tester.collections.advanced.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {

        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("Roma", "Warsaw");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("Milan", "Prague");
        Flight flight4 = new Flight("Manchester", "Krakow");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;
    }
}
