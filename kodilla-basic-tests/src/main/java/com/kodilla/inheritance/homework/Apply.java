package com.kodilla.inheritance.homework;

public class Apply {

    public static void main(String[] args) {

        Win8 win8 = new Win8(2012);
        Win10 win10 = new Win10(2015);

        restartAndPrintYearOfRelease(win8);
        restartAndPrintYearOfRelease(win10);

    }
    public static void restartAndPrintYearOfRelease(OperatingSystem os) {
        os.turnOff();
        os.turnOn();
        os.printYearOfRelease();
    }
}
