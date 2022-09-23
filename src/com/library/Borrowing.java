package com.library;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Borrowing {
    public Borrowing(Book borrowedBook, Subscriber subscriber, LocalDate borrowingDate, LocalDate returnDate) {
        this.borrowedBook = borrowedBook;
        this.subscriber = subscriber;
        this.borrowingDate = borrowingDate;
        this.returnDate = returnDate;
    }

    public Borrowing(Book borrowedBook, Subscriber subscriber, LocalDate borrowingDate) {
        this.borrowedBook = borrowedBook;
        this.subscriber = subscriber;
        this.borrowingDate = borrowingDate;
    }

    private Book borrowedBook;
    private Subscriber subscriber;
    private LocalDate borrowingDate;

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    private LocalDate returnDate;

    public long numberOfDays() {
        return returnDate == null ? DAYS.between(borrowingDate, LocalDate.now()) : DAYS.between(borrowingDate, returnDate);
    }
}
