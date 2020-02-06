package com.patterns.observer3;

public interface Subject {

//    Knows its observers
//    Has any number of observer
//    Provides an interface to attach and detaching observer object at run time

    void register(Observer observer);
    void notifyObserver();
}
