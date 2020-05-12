package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/empty.csv")
    public void shouldThrowsExceptionWhenSetIsEmpty() throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>();
        assertThrows(InvalidNumberException.class, GamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/twoUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowsExceptionWhenSetHasInvalidSize(int one, int two) throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>(one, two);
        assertThrows(InvalidNumberException.class, GamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixUserNumbersWithZero.csv", numLinesToSkip = 1)
    public void shouldThrowsExceptionWhenSetContainsZero(int one, int two, int three, int four, int five, int six) throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>(one, two, three, four, five, six);
        assertThrows(InvalidNumberException.class, GamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixUserNumbersWithNumbersOutsideRange.csv", numLinesToSkip = 1)
    public void shouldThrowsExceptionWhenSetContainsNumbersOutsideRange(int one, int two, int three, int four, int five, int six) throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>(one, two, three, four, five, six);
        assertThrows(InvalidNumberException.class, GamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixUserNumbersWithNegativeNumber.csv", numLinesToSkip = 1)
    public void shouldThrowsExceptionWhenSetContainsNegativeNumber(int one, int two, int three, int four, int five, int six) throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>(one, two, three, four, five, six);
        assertThrows(InvalidNumberException.class, GamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixCorrectUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowsExceptionWhenSetContainsNegativeNumber(int one, int two, int three, int four, int five, int six) throws InvalidNumberException {
        Set<Integer> userNumbers = new HashSet<>(one, two, three, four, five, six);
        int count = GamblingMachine.howManyWins(userNumbers);
        assertTrue(count >= 1 && count <= 6);
    }
}