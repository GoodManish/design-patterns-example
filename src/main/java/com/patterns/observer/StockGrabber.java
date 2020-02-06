package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private List<Observer> observers;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;


    public StockGrabber(){
        observers = new ArrayList<>();
    }
    //Setter
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();

    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }
    //

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void deRegister(Observer observerToDelete) {
        int index = observers.indexOf(observerToDelete);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(ibmPrice, aaplPrice,googPrice);
        }
    }


}
