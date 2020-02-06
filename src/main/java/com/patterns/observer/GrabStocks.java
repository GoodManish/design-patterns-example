package com.patterns.observer;


public class GrabStocks  {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setAaplPrice(197);
        stockGrabber.setIbmPrice(677.60);
        stockGrabber.setGoogPrice(676.40);




    }
}
