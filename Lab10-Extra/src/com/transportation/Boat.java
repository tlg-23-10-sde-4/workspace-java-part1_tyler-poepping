package com.transportation;

public class Boat extends Vehicle {
    public Boat(String vin) {
        super(vin);
    }
    public void moveTo(String location) {
        System.out.println("Moving to ");
    }
}
