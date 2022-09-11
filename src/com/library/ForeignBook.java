package com.library;

public class ForeignBook extends Book {
    public ForeignBook(String bookName, String authorName, int numberOfPages, String language) {
        super(bookName, authorName, numberOfPages);
        this.language = language;
    }

    public ForeignBook(String bookName, String authorName, int numberOfPages) {
        super(bookName, authorName, numberOfPages);
        this.language = "English";
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String language;
}
