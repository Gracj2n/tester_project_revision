package com.tester.parametrized_tests.homework2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    private static Stream<Arguments> setsForTestingWithException() {

        Set<Integer> notEnoughNumbers = new HashSet<>();
        notEnoughNumbers.add(11);
        notEnoughNumbers.add(44);
        notEnoughNumbers.add(32);

        Set<Integer> tooManyNumbers = new HashSet<>();
        tooManyNumbers.add(1);
        tooManyNumbers.add(21);
        tooManyNumbers.add(19);
        tooManyNumbers.add(32);
        tooManyNumbers.add(43);
        tooManyNumbers.add(5);
        tooManyNumbers.add(16);

        Set<Integer> zeroInNumbers = new HashSet<>();
        zeroInNumbers.add(0);
        zeroInNumbers.add(1);
        zeroInNumbers.add(2);
        zeroInNumbers.add(3);
        zeroInNumbers.add(4);
        zeroInNumbers.add(5);

        Set<Integer> numbersOutOfScope = new HashSet<>();
        numbersOutOfScope.add(-1);
        numbersOutOfScope.add(44);
        numbersOutOfScope.add(21);
        numbersOutOfScope.add(31);
        numbersOutOfScope.add(11);
        numbersOutOfScope.add(31);

        Set<Integer> oneNumberOutOfMarginalNumbersInSet = new HashSet<>();
        oneNumberOutOfMarginalNumbersInSet.add(50);
        oneNumberOutOfMarginalNumbersInSet.add(49);
        oneNumberOutOfMarginalNumbersInSet.add(44);
        oneNumberOutOfMarginalNumbersInSet.add(31);
        oneNumberOutOfMarginalNumbersInSet.add(11);
        oneNumberOutOfMarginalNumbersInSet.add(34);

        Set<Integer> twoSameNumbersInSet = new HashSet<>();
        twoSameNumbersInSet.add(1);
        twoSameNumbersInSet.add(1);
        twoSameNumbersInSet.add(36);
        twoSameNumbersInSet.add(42);
        twoSameNumbersInSet.add(26);
        twoSameNumbersInSet.add(15);

        return Stream.of(
                Arguments.of(notEnoughNumbers),
                Arguments.of(tooManyNumbers),
                Arguments.of(zeroInNumbers),
                Arguments.of(numbersOutOfScope),
                Arguments.of(oneNumberOutOfMarginalNumbersInSet),
                Arguments.of(twoSameNumbersInSet)

        );
    }

    @ParameterizedTest
    @MethodSource(value = "setsForTestingWithException")
    void doesHowManyWinsThrowsExceptionWithArguments(Set<Integer> numbers) throws InvalidNumbersExceptions {
        assertThrows(InvalidNumbersExceptions.class, () -> gamblingMachine.howManyWins(numbers));
    }
}