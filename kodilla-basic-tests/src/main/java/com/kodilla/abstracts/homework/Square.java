package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(3, 3);

    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = getSide() * getSide();
        System.out.println("Surface area of square: " + surfaceArea);
    }

    public void calculateCircumference() {
        double circumference = 4 * getSide();
        System.out.println("Circumference of square: " + circumference);
    }
}
