package com.tester.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    PrimeChecker checker = new PrimeChecker();

    @Test
    void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenPassingMinusSix() {
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }
}