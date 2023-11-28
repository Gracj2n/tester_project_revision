package com.tester.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, -30})
    void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}