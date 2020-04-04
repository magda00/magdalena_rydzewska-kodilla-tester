package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        int sumResukt = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(7, sumResukt);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " +b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " +b);
        }
    }
}
