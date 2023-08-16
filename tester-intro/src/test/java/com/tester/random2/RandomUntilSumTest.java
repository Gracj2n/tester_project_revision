package com.tester.random2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomUntilSumTest {

    @Test
    void generateRandomNumbers() {
        RandomUntilSum randomUntilSum = new RandomUntilSum();
        randomUntilSum.generateRandomNumbers();
        System.out.println();
        System.out.println(randomUntilSum.getMax());
        System.out.println(randomUntilSum.getMin());
    }


}