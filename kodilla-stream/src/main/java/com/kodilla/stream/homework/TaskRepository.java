package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Create plan", LocalDate.of(2020, 01, 13), LocalDate.of(2020, 04, 13)));
        tasks.add(new Task("Realize plan", LocalDate.of(2020, 04, 13), LocalDate.of(2020, 06, 13)));
        tasks.add(new Task("Summarize the realisation of plan", LocalDate.of(2020, 06, 13), LocalDate.of(2020, 07, 13)));
        tasks.add(new Task("Prepare TO-DO list", LocalDate.of(2020, 03, 20), LocalDate.of(2020, 07, 20)));

        return tasks;
    }
}
