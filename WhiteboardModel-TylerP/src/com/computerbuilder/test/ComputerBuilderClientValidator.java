package com.computerbuilder.test;

import com.computerbuilder.components.*;

public class ComputerBuilderClientValidator {
    public static void main(String[] args) {
        // We will instantiate all component classes that have constraints

        // Graphics card Testing
        // Test our constraint ABOVE max_value... ERROR is expected
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setDisplayPorts(7);
        graphicsCard.setHdmiPorts(7);
        System.out.println(graphicsCard.toString());
        System.out.println();

        // Test our constraint AT max_value... No Error is expected
        graphicsCard.setDisplayPorts(GraphicsCard.MAX_DISPLAYPORTS);
        graphicsCard.setHdmiPorts(GraphicsCard.MAX_DISPLAYPORTS);
        System.out.println(graphicsCard.toString());
        System.out.println();

        // Test our constraint at min_value... No Error is expected
        graphicsCard.setDisplayPorts(GraphicsCard.MIN_DISPLAYPORTS);
        graphicsCard.setHdmiPorts(GraphicsCard.MIN_HDMIPORTS);
        System.out.println(graphicsCard.toString());
        System.out.println();

        // Test our constraint below min_value... ERROR is expected
        graphicsCard.setDisplayPorts(-1);
        graphicsCard.setHdmiPorts(-1);
        System.out.println(graphicsCard.toString());
        System.out.println();


        // Storage Testing
        // Test our string outside of constraint... ERROR is expected
        Storage storage = new Storage();
        storage.setType("ABC");
        System.out.println(storage.toString());
        System.out.println();

        // Test both of our constraints... No error is expected
        storage.setType("HDD");
        System.out.println(storage.toString());
        System.out.println();
        storage.setType("SSD");
        System.out.println(storage.toString());
        System.out.println();
    }
}