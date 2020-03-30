package com.kodilla.inheritance.homework;

public class Win8 extends OperatingSystem {

    public Win8(int year) {
        super(year);

    }

    @Override
    public void turnOn() {
        System.out.println("Win8 was turned on");
    }
}
