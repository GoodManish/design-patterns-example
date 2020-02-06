package com.patterns.observer3;

import java.util.ArrayList;
import java.util.List;

/*
      concrete Subject class. It maintain the state of the Product object and
      when there is any change in the state of Product object occurs, it notifies the attached Observers.
*/
public class Product implements Subject {

    private String productName;
    private String availablity;

    List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public Product(String productName, String availablity) {
        this.productName = productName;
        this.availablity = availablity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAvailablity() {
        return availablity;
    }

    public void setAvailablity(String availablity) {
        this.availablity = availablity;
        System.out.println("Avaliblity Updated.");
        notifyObserver();
    }


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.availablity);
        }
    }
}
