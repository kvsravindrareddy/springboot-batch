package com.veera.example;

public class Vehicle {
    /**
     * @deprecated
     * Diesel vehicle are not used anymore
     */
    @Deprecated
    public void diesel() {
        System.out.println("This is Diesel vehicle");
    }

    public void petrol() {
        System.out.println("This is Petrol vehicle");
    }
}