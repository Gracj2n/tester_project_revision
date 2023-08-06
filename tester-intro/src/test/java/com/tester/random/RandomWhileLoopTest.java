package com.tester.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomWhileLoopTest {

    @Test
    void getRandomNumber() {
        RandomWhileLoop randomWhileLoop = new RandomWhileLoop();
        int number = randomWhileLoop.getRandomNumber(20);
        System.out.println(number);
    }
}