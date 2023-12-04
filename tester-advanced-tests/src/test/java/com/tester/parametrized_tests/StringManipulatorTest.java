package com.tester.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator stringManipulator = new StringManipulator();

    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("example string", 13),
                Arguments.of("", 0),
                Arguments.of("   ", 0),
                Arguments.of("e x a m p l e", 7),
                Arguments.of("    example", 7),
                Arguments.of("ex , a, mp, le", 10)
        );
    }

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
    @CsvSource(value = {"test1, 5", "apczyf, 6", "bamitros, 8"})
    void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringLengthWithoutSpaces.csv", numLinesToSkip = 1)
    void shouldCalculateStringLengthWithoutSpacesCSV(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @MethodSource(value = "provideStringsForTestingLength")
    void shouldReturnStringsLengthUsingMethodAsTestValues(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }
}