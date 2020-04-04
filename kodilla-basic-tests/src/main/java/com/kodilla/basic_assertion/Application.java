package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(7, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(3, subtractResult);

        if (correctSubtract) {
            System.out.println("metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powerResult = calculator.power(a);
        boolean correctPower = ResultChecker.assertEquals(25, powerResult);

        if (correctPower) {
            System.out.println("Metoda power działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda powwer nie działa poprawnie dla liczby " + a);
        }
    }
}
