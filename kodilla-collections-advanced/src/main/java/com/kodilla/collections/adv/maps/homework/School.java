package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<Integer> count = new ArrayList<>();

    public School(int... count) {
        for (int number : count) {
            this.count.add(number);
        }
    }

    public int getCount() {
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
