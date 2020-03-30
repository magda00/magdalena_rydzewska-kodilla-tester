package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int yearOfRelease;

    public OperatingSystem(int year) {
        this.yearOfRelease = year;
    }

    public void turnOn() {
        System.out.println("This operating system was turned on");
    }

    public void turnOff() {
        System.out.println("This operating system was turned off");
    }

    public void printYearOfRelease() {
        System.out.println("This operating system was released in " + yearOfRelease);
    }


}
