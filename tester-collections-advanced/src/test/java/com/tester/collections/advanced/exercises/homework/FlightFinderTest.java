package com.tester.collections.advanced.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    void shouldFindFlightsFromWarsaw() {
        int expectedSize = flightFinder.findFlightsFrom("Warsaw").size();
        assertEquals(expectedSize, 1);
    }

    @Test
    void shouldFindFlightsToWarsaw() {
        int expectedSize = flightFinder.findFlightsTo("Warsaw").size();
        assertEquals(expectedSize, 1);
    }

    @Test
    void shouldFindFlightsToKrakow() {
        int expectedSize = flightFinder.findFlightsTo("Krakow").size();

        assertEquals(expectedSize, 1);
    }

}