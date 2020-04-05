package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(6, 7);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = getSide() * getHeight();
        System.out.println("Surface area of rectangle: " + surfaceArea);
    }

    @Override
    public void calculateCircumference() {
        double circumference = 2 * getSide() + 2 * getHeight();
        System.out.println("Circumference of rectangle: " + circumference);
    }
}
