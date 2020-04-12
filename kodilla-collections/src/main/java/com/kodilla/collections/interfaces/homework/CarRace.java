package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car volvo = new Volvo(0);
        doRace(volvo);

        Car subaru = new Subaru(0);
        doRace(subaru);

        Car tesla = new Tesla(0);
        doRace(tesla);

    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
