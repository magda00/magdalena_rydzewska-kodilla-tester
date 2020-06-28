package com.kodilla.inheritance;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ConvertibleTest {

    private Convertible convertible = new Convertible(4, 2);

    @Test
    public void shouldReturnNumberOfWheelsAndSeats() {
        //given
        //when
        int wheels = convertible.getWheels();
        int seats = convertible.getSeats();
        //then
        Assert.assertEquals(4, wheels);
        Assert.assertEquals(2, seats);
    }

    @Test
    public void shouldDisplayNumberOfSeats() {
        //given
        //when
        String display = convertible.displayNumberOfSeats();
        //given
        Assert.assertEquals("Number of seats: 2", display);
    }
}
