package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape triangle = new Triangle();

        Shape square = new Square();

        Shape rectangle = new Rectangle();


        ShapeProcessor processor = new ShapeProcessor();
        processor.process(triangle);
        processor.process(square);
        processor.process(rectangle);

    }
}
