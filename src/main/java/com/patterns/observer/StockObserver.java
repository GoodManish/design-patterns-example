package com.patterns.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private Subject stockGrabber;

    private int observerId;
    private static int observerIDtracker = 0;


    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIDtracker;
        System.out.println("New Observer - "+this.observerId);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerId +
                "\nIBM :  "+ibmPrice +
                "\nAAPL : "+aaplPrice+
                "\nGOOG : "+googPrice+ "\n");
    }
}
