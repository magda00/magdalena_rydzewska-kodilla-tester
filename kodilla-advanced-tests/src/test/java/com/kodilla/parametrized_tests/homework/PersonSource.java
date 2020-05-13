package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    private static Stream<Arguments> providePersonsFOrTestingBmi() {
        return Stream.of(
                Arguments.of(1.7, 55.0, "Normal (healthy weight)"),
                Arguments.of(2.0, 103.5, "Overweight"),
                Arguments.of(1.52, 85.7, "Obese Class II (Severely obese)"),
                Arguments.of(1.95, 67.9, "Underweight"),
                Arguments.of(1.2, 80.0, "Obese Class V (Super Obese)")
        );
    }

}
