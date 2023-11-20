package com.tester.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportRepositoryTest {

    //given
    AirportRepository airportRepository = new AirportRepository();

    @Test
    void isAirportInUse() throws AirportNotFoundException {
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertEquals(true, isWarsawInUse);
    }

    @Test
    void isAirportInUse_withException() {
        //then                                              //when
        assertThrows(AirportNotFoundException.class, () -> airportRepository.isAirportInUse("Vienna"));
    }

}