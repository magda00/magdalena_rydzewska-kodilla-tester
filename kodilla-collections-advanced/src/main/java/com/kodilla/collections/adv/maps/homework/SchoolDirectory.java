package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> schools = new HashMap<>();

        Principal tom = new Principal("Tom", "Hanks");
        Principal mark = new Principal("Mark", "Tyson");
        Principal bryan = new Principal("Bryan", "Adams");

        School tomSchool = new School("Primary school", 12, 15, 18, 22, 17);
        School markSchool = new School("Secondary school", 32, 25, 18, 22, 27, 24);
        School bryanSchool = new School("High school", 30, 15, 15, 27);

        schools.put(tom, tomSchool);
        schools.put(mark, markSchool);
        schools.put(bryan, bryanSchool);

        for (Map.Entry<Principal, School> principalEntry : schools.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName()
                    + " - director of " + principalEntry.getValue().getName() + ". Count of students in this school: " + principalEntry.getValue().getSum());
        }

    }
}
