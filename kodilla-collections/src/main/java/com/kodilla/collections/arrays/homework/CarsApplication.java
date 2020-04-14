package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    private static Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
            CarUtils.describeCar(cars[i]);
        }

    }

    public static Car drawCar() {
        int drawnCarBrand = random.nextInt(3);

        int speedSubaru = random.nextInt(101);
        int speedTesla = random.nextInt(101);
        int speedVolvo = random.nextInt(101);

        if (drawnCarBrand == 0) {
            return new Subaru(speedSubaru);
        } else if (drawnCarBrand == 1) {
            return new Tesla(speedTesla);
        } else {
            return new Volvo(speedVolvo);
        }
    }
}
