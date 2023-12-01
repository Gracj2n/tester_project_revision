package com.tester.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"STATUS,sutats", "APczYk,kyzcpa", "null,llun"})
    void shouldReverseWithLoverCase(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLoverCase(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    void shouldReverseWithLoverCaseCSV(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLoverCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test1, 5", "apczyfR23$4, 11", "bamitros, 8"})
    void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringLengthWithoutSpaces.csv", numLinesToSkip = 1)
    void shouldCalculateStringLengthWithoutSpacesCSV(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"a,b,c,d,e,f,g,h : 7"})
    void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }
}