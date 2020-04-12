package com.kodilla.collections.interfaces.homework;

public class Subaru implements Car {

    int speed;

    public Subaru(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 70;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }
}
