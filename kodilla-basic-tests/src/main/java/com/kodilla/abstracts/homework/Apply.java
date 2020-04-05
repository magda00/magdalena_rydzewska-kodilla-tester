package com.kodilla.abstracts.homework;

public class Apply {
    public static void main(String[] args) {
        Job teacher = new Teacher();
        Job lawyer = new Lawyer();
        Job engineer = new Engineer();

        Person adela = new Person("Adela", 28, "teacher");
        teacher.giveResponsibilities();
        Person livia = new Person("Livia", 35, "lawyer");
        lawyer.giveResponsibilities();
        Person patison = new Person("Patison", 38, "Engineer");
        engineer.giveResponsibilities();

    }


}
