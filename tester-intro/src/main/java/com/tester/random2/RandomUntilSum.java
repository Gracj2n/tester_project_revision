package com.tester.random2;

import java.util.Random;

public class RandomUntilSum {
    int min = Integer.MAX_VALUE;
    int max;
    public void generateRandomNumbers() {
        Random randomNumber = new Random();
        int sum = 0;
        while (sum < 50) {
            int generatedNumber = randomNumber.nextInt(30);
            sum = sum + generatedNumber;
            if (generatedNumber > max) {
                max = generatedNumber;
            }
            if (generatedNumber < min) {
                min = generatedNumber;
            }
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}

