package com.tester.parametrized_tests.homework3;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class StringsSources {

    public static Stream<Arguments> provideStringsForTesting() {

        Person person1 = new Person(1.91, 91);
        Person person2 = new Person(1.65, 65);
        Person person3 = new Person(1.80, 95);
        Person person4 = new Person(1.75, 62);
        Person person5 = new Person(1.66, 45);
        Person person6 = new Person(2.01, 100);
        Person person7 = new Person(1.57, 55);
        Person person8 = new Person(1.84, 112);
        Person person9 = new Person(1.78, 94);
        Person person10 = new Person(1.76, 61);

        return Stream.of(
                Arguments.of(person1, "Normal (healthy weight)"),
                Arguments.of(person2, "Normal (healthy weight)"),
                Arguments.of(person3, "Overweight"),
                Arguments.of(person4, "Normal (healthy weight)"),
                Arguments.of(person5, "Underweight"),
                Arguments.of(person6, "Normal (healthy weight)"),
                Arguments.of(person7, "Normal (healthy weight)"),
                Arguments.of(person8, "Obese Class I (Moderately obese)"),
                Arguments.of(person9, "Overweight"),
                Arguments.of(person10, "Normal (healthy weight)")
        );
    }
}
