package com.kodilla.abstracts.homework;

public class Lawyer extends Job {

    public Lawyer() {
        super(3500, "legal advice");
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("My responsibility is " + getResponsibilities());

    }
}
