package com.tester.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    //UserNames

    @ParameterizedTest
    @CsvSource(value = {"AbCd10-._", "333", "..."})
    void shouldReturnTrueWhenUsernameStringIsCorrect(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"A2", "abC32#", "__"})
    void shouldReturnFalseWhenUsernameStringIsIncorrect(String input) {
        assertFalse(userValidator.validateUsername(input));
    }


    //E-mail addresses

    @ParameterizedTest
    @CsvSource(value = {"abbcde@gmail.com", "123123@gmail.com", "emailexample3@emgi.pl"})
    void shouldReturnTrueWhenEmailStringIsCorrect(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"abbcdegmail.com", "123123@gmail_com", "em@#ailexample3@emgi.pl"})
    void shouldReturnFalseWhenEmailStringIsIncorrect(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

}