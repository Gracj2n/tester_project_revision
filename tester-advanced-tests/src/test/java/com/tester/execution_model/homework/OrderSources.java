package com.tester.execution_model.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.Arguments;

import java.time.Instant;
import java.util.stream.Stream;

public class OrderSources {

    public static Stream<Arguments> provideDatesForTesting() {
        return Stream.of(
                Arguments.of(Instant.parse("2015-01-01T00:00:00.00Z"), Instant.parse("2018-12-31T00:00:00.00Z"), 5),
                Arguments.of(Instant.parse("2018-01-01T00:00:00.00Z"), Instant.parse("2020-12-31T00:00:00.00Z"), 4),
                Arguments.of(Instant.parse("2017-01-01T00:00:00.00Z"), Instant.parse("2019-12-31T00:00:00.00Z"), 4),
                Arguments.of(Instant.parse("2021-01-01T00:00:00.00Z"), Instant.parse("2023-12-31T00:00:00.00Z"), 3)
        );
    }

    public static Stream<Arguments> providePricesForTesting() {
        return Stream.of(
                Arguments.of(1500, 3000, 2),
                Arguments.of(3500, 8000, 3),
                Arguments.of(1000, 20000, 10),
                Arguments.of(7000, 10000, 2),
                Arguments.of(0, 6000, 7)
        );
    }
}
