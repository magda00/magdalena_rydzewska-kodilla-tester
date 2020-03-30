package com.kodilla.inheritance.homework;

public class Apply {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(2000);

        Win8 win8 = new Win8(2012);
        Win10 win10 = new Win10(2015);

        Restart(win8);
        Restart(win10);

    }
    public static void Restart(OperatingSystem os){
        os.turnOff();
        os.turnOn();
    }
}
