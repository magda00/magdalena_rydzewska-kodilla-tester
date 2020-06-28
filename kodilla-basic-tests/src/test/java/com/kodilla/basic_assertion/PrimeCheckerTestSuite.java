package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker checker = new PrimeChecker();
    private static int count = 0;

    @ParameterizedTest
    @ValueSource(ints = {-14, 0, 1, 14})
    public void shouldReturnFalseWhenPassingIncorrectNumber(int number) {
        boolean result = checker.isPrime(number);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 7, 13})
    public void shouldReturnTrueWhenPassingCorrectNumber(int number) {
        boolean result = checker.isPrime(number);
        count++;
        System.out.println("Test number: " + count);
        assertTrue(result);
    }

}
