package com.kodilla.basic_assertion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ResultCheckerTest {

    @Test
    public void shouldReturnTrue() {
        //given
        Calculator calculator = new Calculator();
        //when
        int sumResult = calculator.sum(5, 2);
        //then
        Assert.assertTrue(ResultChecker.assertEquals(7, sumResult));
    }
}
