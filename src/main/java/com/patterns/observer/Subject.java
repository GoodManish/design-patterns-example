package com.patterns.observer;


public interface Subject {
    void register(Observer newObserver);
    void deRegister(Observer newObserver);
    void notifyObservers();
}
