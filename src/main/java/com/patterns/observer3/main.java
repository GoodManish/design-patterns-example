package com.patterns.observer3;

import java.util.List;

public class main {
    public static void main(String[] args) {
        //product - subject
        Product samsungLEDTv = new Product("SamsungTV", "NO");

        //person - observer hold subject reference
        Observer manish = new Person("Manish", samsungLEDTv);
        Observer shikha = new Person("shikha", samsungLEDTv);

        List<Observer> observers = samsungLEDTv.getObservers();
        System.out.println("Registered users : "+observers);

        samsungLEDTv.setAvailablity("YES");


    }
}
