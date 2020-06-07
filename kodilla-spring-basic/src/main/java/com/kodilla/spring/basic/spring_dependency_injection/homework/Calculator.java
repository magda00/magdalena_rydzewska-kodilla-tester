package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        this.display.display(sum);
        return sum;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        this.display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        this.display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        double result = a / b;
        if (b == 0) {
            return 0;
        }
        this.display.display(result);
        return result;
    }
}
