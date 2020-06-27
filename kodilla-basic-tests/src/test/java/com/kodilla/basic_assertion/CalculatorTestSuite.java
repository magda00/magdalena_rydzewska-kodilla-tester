package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private Calculator calculator = new Calculator();
    int a = 5;
    int b = 2;

    @Test
    public void testSum() {
        //given
        //when
        int sumResult = calculator.sum(a, b);
        //then
        assertEquals(7, sumResult);
    }

    @Test
    public void testSubtract() {
        //given
        //when
        int subtractResult = calculator.subtract(a, b);
        assertEquals(3, subtractResult);
    }

    @Test
    public void testPower() {
        //given
        //when
        int result = calculator.power(a);
        assertEquals(25, result);
    }

}
