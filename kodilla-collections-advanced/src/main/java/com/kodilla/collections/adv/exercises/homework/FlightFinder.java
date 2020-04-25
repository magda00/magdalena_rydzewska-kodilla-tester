package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightFinder {
    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flightsDeparture : FlightRepository.getFlightsTable()) {
            if (flightsDeparture.getDeparture().equals(departure)) {
                flightsFrom.add(flightsDeparture);
            }
        }
        return flightsFrom;
    }

    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flightsArrival : FlightRepository.getFlightsTable()) {
            if (flightsArrival.getArrival().equals(arrival)) {
                flightsTo.add(flightsArrival);
            }
        }
        return flightsTo;
    }
}
