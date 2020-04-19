package com.kodilla.collections.adv.immutable;

public class Book {                  //add `final` before 'Book'` and no class won't extend 'Book'
    protected String author;         //add `final` before 'String' and variable won't be changed
    protected String title;          //add `final` before 'String' and variable won't be changed

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {      //add `final` before 'String' and method won't be overridden
        return author;
    }

    public String getTitle() {        //add `final` before 'String' and method won't be overridden
        return title;
    }
}
