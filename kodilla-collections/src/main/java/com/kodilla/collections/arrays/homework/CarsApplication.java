package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Tesla;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();

        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);

        int speedSubaru = random.nextInt(101);
        int speedTesla = random.nextInt(101);
        int speedVolvo = random.nextInt(101);

        if (drawnCarBrand == 0)
            return new Subaru(speedSubaru);
        else if (drawnCarBrand == 1)
            return new Tesla(speedTesla);
        else
            return new Volvo(speedVolvo);
    }
}
