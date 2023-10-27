package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    public void goToWork() throws DestinationUnreachableException {
        // TODO: create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Ford", "F-150");
        c.start();
        c.moveTo("West Seattle");
        c.stop();

        // TODO: call moveTo() on the Car object, passing "West Seattle" for the destination


        System.out.println("Arrived at work");
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}