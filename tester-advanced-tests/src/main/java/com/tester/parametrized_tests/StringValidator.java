package com.tester.parametrized_tests;

public class StringValidator {
    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
