package com.kodilla.mockito.homework;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void receive(Alert alert){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
