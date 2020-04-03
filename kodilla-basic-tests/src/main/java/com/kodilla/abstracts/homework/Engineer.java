package com.kodilla.abstracts.homework;

public class Engineer extends Job {
    public Engineer() {
        super(5000, "desining");
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("My responsibility is " + getResponsibilities());
    }
}
