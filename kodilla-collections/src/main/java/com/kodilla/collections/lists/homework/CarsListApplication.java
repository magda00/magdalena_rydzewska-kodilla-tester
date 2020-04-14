package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Volvo> cars = new ArrayList<>();

        cars.add(new Volvo(0));
        cars.add(new Volvo(20));
        cars.add(new Volvo(30));
        cars.add(new Volvo(50));
        cars.add(new Volvo(70));

        System.out.println("Before:");
        for (Volvo volvo : cars) {
            CarUtils.describeCar(volvo);
        }

        cars.remove(0);
        cars.remove(new Volvo(70));

        System.out.println("After:");
        for (Volvo volvo : cars) {
            CarUtils.describeCar(volvo);
        }
        System.out.println("Number of elements: " + cars.size());

    }
}
