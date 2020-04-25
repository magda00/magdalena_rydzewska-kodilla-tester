package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;


public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();

        flightsTable.add(new Flight("Warsaw", "Budapest"));
        flightsTable.add(new Flight("Warsaw", "Split"));
        flightsTable.add(new Flight("Budapest", "Moscow"));
        flightsTable.add(new Flight("Budapest", "Warsaw"));
        flightsTable.add(new Flight("Moscow", "Warsaw"));
        flightsTable.add(new Flight("Rejkjavik", "Warsaw"));

        return flightsTable;
    }
}
