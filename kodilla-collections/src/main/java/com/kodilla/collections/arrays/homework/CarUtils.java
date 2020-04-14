package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Subaru) {
            return "Subaru";
        } else if (car instanceof Tesla) {
            return "Tesla";
        } else if (car instanceof Volvo) {
            return "Volvo";
        } else {
            return "Unknown cars brand";
        }
    }
}
