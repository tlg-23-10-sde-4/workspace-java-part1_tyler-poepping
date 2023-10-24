package com.computerbuilder.components;

public class MotherBoard {
    private String make;
    private String model;
    private Boolean hasWifi;
    private Boolean hasEthernet;
    private Double price;


    // Constructors
    public MotherBoard() {} // Empty ctor

    public MotherBoard(String make, String model, Boolean hasWifi, Boolean hasEthernet, Double price) {
        this.make = make;
        this.model = model;
        this.hasWifi = hasWifi;
        this.hasEthernet = hasEthernet;
        this.price = price;
    }


    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean hasWifi() {
        return hasWifi;
    }

    public void setHasWifi(Boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Boolean hasEthernet() {
        return hasEthernet;
    }

    public void setHasEthernet(Boolean hasEthernet) {
        this.hasEthernet = hasEthernet;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Wifi", "Ethernet", "Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(hasWifi()), String.valueOf(hasEthernet()), String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-15s", name));
        }
        builder.append("\n");
        builder.append("------------------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-15s", component));
        }
        builder.append("\n");
        builder.append("------------------------------------------------------------------");

        return builder.toString();
    }
}