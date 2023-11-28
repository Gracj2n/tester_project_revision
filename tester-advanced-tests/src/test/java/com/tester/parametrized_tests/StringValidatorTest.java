package com.tester.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    StringValidator stringValidator = new StringValidator();

    @Test
    void shouldReturnFalseIfStringIsNotEmpty() {
        boolean result = stringValidator.isBlank("Test_1");
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
     void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(stringValidator.isBlank(text));
    }
}