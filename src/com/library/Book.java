package com.library;

public class Book {
    public Book(String bookName, String authorName, int numberOfPages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    private String bookName;
    private String authorName;
    private int numberOfPages;

    @Override
    public String toString() {
        return this.bookName;
    }
}
