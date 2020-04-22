package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book hobbit = bookManager.createBook("Hobbit", "Tolkien");
        Book hobbit2 = bookManager.createBook("Hobbit", "Tolkien");
        Book witcher = bookManager.createBook("The witcher", "Sapkowski");
        Book harry = bookManager.createBook("Harry Potter", "Rowling");

        System.out.println(hobbit == hobbit2);
        System.out.println(hobbit.equals(hobbit2));
        System.out.println("--------------");
        System.out.println(hobbit == witcher);
        System.out.println(hobbit.equals(witcher));
        System.out.println("--------------");
        System.out.println(hobbit == harry);
        System.out.println(hobbit.equals(harry));
        System.out.println("--------------");
        System.out.println(witcher == harry);
        System.out.println(witcher.equals(harry));
    }
}
