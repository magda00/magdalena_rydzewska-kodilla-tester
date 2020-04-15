package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("1", 2.5, 1.5, true));
        stamps.add(new Stamp("2", 3.0, 2.0, false));
        stamps.add(new Stamp("3", 1.0, 1.0, true));
        stamps.add(new Stamp("1", 2.5, 1.5, false));
        stamps.add(new Stamp("2", 3.0, 2.0, false));
        stamps.add(new Stamp("4", 2.2, 3.3, false));
        stamps.add(new Stamp("1", 2.5, 1.5, true));

        System.out.println("Set size: " + stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}