package com.tester.parametrized_tests.homework3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource(value = "com.tester.parametrized_tests.homework3.StringsSources#provideStringsForTesting")
    void shouldReturnCorrectStrings(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
}