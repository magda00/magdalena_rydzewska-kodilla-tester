package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arystoteles", new Teacher("Platon")));
        students.add(new Student("Platon", new Teacher("Sokrates")));
        students.add(new Student("Wolfgang Amadeus Mozart", null));
        students.add(new Student("Fryderyk Chopin", null));


        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Student: " + student.getName() + ", teacher: " + teacher.orElse(new Teacher("<undefined>")).getName());

        }
    }
}
