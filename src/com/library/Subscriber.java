package com.library;

public class Subscriber {
    public Subscriber(String firstName, String lastName, SubscriberAddress address, String emailAddress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    private String firstName;
    private String lastName;
    private SubscriberAddress address;
    private String emailAddress;
    private int age;

    public boolean isUnderage() {
        return this.age < 18;
    }
}
