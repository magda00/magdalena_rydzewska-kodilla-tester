package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher() {
        super(2500, "teaching");
    }

    @Override
    public void giveResponsibilities() {
        System.out.println("My responsibility is " + getResponsibilities());
    }
}
