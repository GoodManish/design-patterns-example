package com.patterns.factory;

import java.io.*;

class GenerateBill {
    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String planName = br.readLine();
        String planName = "commercialplan";
        System.out.println("Enter the number of units for bill will be calculated: ");
//        int units = Integer.parseInt(br.readLine());
        int units = 500;

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.println("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}//end of GenerateBill class.
