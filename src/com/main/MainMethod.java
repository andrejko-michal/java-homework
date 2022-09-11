package com.main;

import java.time.LocalDate;
import com.library.*;
public class MainMethod {
    public static void main(String[] args) {

        Book physics = new ScientificBook("Basics of Gravity", "Isaac Newton", 200, "Physics");

        Book serbian = new ForeignBook("Orlovi Rano Lete", "Branko Copic", 120, "Serbian");

        Book slovak = new Book("Zart", "Milan Kunera", 120);

        Book english = new ForeignBook("Love in the time of Cholera", "Gabriel Garcia Marquez", 120);

        SubscriberAddress johnCarrotAddress = new SubscriberAddress("Hlavna", 17, "Kosice", "Slovakia", 4001);

        Subscriber johnCarrot = new Subscriber("John", "Carrot", johnCarrotAddress, "john.carrot@gmail.com", 27);

        Borrowing borrowing1 = new Borrowing(physics, johnCarrot, LocalDate.now().minusDays(19));

//        borrowing1.setReturnDate(LocalDate.now().minusDays(1));


        System.out.println(physics);

        System.out.println(slovak);

        System.out.println(johnCarrot.isUnderage());

        System.out.println(borrowing1.numberOfDays());


    }
}
