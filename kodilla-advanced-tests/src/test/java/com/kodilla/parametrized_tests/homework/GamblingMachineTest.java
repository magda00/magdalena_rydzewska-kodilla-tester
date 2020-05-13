package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/empty.csv")
    public void shouldThrowExceptionWhenSetIsEmpty() {
        //Given
        Set<Integer> userNumbers = new HashSet<>();
        //When & Then
        assertThrows(InvalidNumberException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/twoUserNumbers.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetHasInvalidSize(int one, int two) {
        //Given
        Set<Integer> userNumbers = Set.of(one, two);
        //When & Then
        assertThrows(InvalidNumberException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixUserNumbersWithZero.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetContainsZero(int one, int two, int three, int four, int five, int six) {
        //Given
        Set<Integer> userNumbers = Set.of(one, two, three, four, five, six);
        //When & Then
        assertThrows(InvalidNumberException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixUserNumbersWithNegativeNumber.csv", numLinesToSkip = 1)
    public void shouldThrowExceptionWhenSetContainsNegativeNumber(int one, int two, int three, int four, int five, int six) {
        //Given
        Set<Integer> userNumbers = Set.of(one, two, three, four, five, six);
        //When & Then
        assertThrows(InvalidNumberException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixCorrectUserNumbers.csv", numLinesToSkip = 1)
    public void shouldCountHowManyWinsWhenSetContainsSixCorrectNumbers(int one, int two, int three, int four, int five, int six) throws InvalidNumberException {
        //Given
        Set<Integer> userNumbers = Set.of(one, two, three, four, five, six);
        //When
        int count = gamblingMachine.howManyWins(userNumbers);
        //Then
        assertTrue(count >= 1 && count <= 6);
    }
}