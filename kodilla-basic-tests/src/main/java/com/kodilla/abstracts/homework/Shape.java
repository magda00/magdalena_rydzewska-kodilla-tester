package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double side;
    private double height;

    public Shape(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public abstract void calculateSurfaceArea();

    public abstract void calculateCircumference();

}
