package com.tester.random;

import java.util.Random;

public class RandomWhileLoop {
    public int getRandomNumber(int max) {
        //max - maksymalna suma losowanych liczb
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
