package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    int speed;

    public Volvo(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 25;
    }
}
