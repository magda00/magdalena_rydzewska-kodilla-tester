package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;

    public String getName() {
        return name;
    }

    private List<Integer> count = new ArrayList<>();

    public School(String name, int... count) {
        this.name = name;
        for (int number : count) {
            this.count.add(number);
        }
    }

    public int getSum() {
        int sum = 0;

        for (int number : count) {
            sum += number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School count: " + count;
    }
}
