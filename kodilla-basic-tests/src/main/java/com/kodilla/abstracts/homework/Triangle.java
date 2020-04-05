package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(5, 8);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = (getSide() * getHeight()) / 2;
        System.out.println("Surface area of triangle: " + surfaceArea);
    }

    public void calculateCircumference() {
        double circumference = 3 * getSide();
        System.out.println("Circumference of triangle: " + circumference);
    }
}
