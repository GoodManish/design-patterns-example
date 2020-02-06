package com.patterns.observer2;

public class Person implements Observer {
    private String personName;

    public Person(String personName, Subject subject) {
        this.personName = personName;
        subject.registerObserver(this);
    }

    public String getPersonName() {
        return personName;
    }

    public void update(String availabiliy) {
        System.out.println("Hello " + personName + ", Product is now " + availabiliy + " on flipkart.");
    }

    @Override
    public String toString() {
        return this.personName;
    }
}
