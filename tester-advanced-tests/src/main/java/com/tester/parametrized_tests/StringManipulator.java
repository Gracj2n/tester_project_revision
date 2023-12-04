package com.tester.parametrized_tests;

public class StringManipulator {
    public String reverseWithLoverCase(String textToReverse) {
        StringBuilder stringBuilder = new StringBuilder(textToReverse);
        return stringBuilder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String textToCheckLength) {
        String value = textToCheckLength.replaceAll(" ", "");
        return value.length();
    }
}
