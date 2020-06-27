package com.kodilla.inheritance;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car car = new Car(4, 5);

    @Test
    public void shouldReturnNumberOfWheelsAndSeats() {
        //given
        //when
        int wheels = car.getWheels();
        int seats = car.getSeats();
        //then
        Assert.assertEquals(4, wheels);
        Assert.assertEquals(5, seats);
    }

    @Test
    public void shouldDisplayNumberOfSeats() {
        //given
        //when
        String display = car.displayNumberOfSeats();
        //given
        Assert.assertEquals("Number of seats: 5", display);
    }
}
