package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem {

    public Win10(int year) {
        super(year);

    }

    @Override
    public void turnOn() {
        System.out.println("Win10 was turned on");
    }
}
