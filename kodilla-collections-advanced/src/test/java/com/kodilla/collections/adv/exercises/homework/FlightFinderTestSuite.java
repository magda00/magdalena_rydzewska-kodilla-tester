package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> flightsFrom = FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Budapest"));
        expectedList.add(new Flight("Warsaw", "Split"));
        assertEquals(expectedList, flightsFrom);
        assertEquals(2, flightsFrom.size());
    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightRepository.getFlightsTable();
        //when
        List<Flight> flightsTo = FlightFinder.findFlightsTo("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Budapest", "Warsaw"));
        expectedList.add(new Flight("Moscow", "Warsaw"));
        expectedList.add(new Flight("Rejkjavik", "Warsaw"));
        assertEquals(expectedList, flightsTo);
        assertEquals(3, flightsTo.size());
    }
}