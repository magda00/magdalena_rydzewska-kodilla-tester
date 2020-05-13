package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#providePersonsFOrTestingBmi")
    public void shouldCalculateBMI(double height, double weight, String text) {
        Person person = new Person(height, weight);
        assertEquals(text, person.getBMI());
    }
}