package com.patterns.factory;

import java.io.*;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.print(units * rate);
    }
}//end of Plan class. 
