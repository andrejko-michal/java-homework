package com.library;

public class ScientificBook extends Book {
    public ScientificBook(String bookName, String authorName, int numberOfPages, String scientificArea) {
        super(bookName, authorName, numberOfPages);
        this.scientificArea = scientificArea;
    }

    private String scientificArea;
}
