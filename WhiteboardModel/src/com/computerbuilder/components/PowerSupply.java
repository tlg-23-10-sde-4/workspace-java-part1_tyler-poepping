package com.computerbuilder.components;

public class PowerSupply {
    private String make;
    private String model;
    private Integer watts;
    private Double price;


    // Constructors
    public PowerSupply() {} // Empty ctor

    public PowerSupply(String make, String model, Integer watts, Double price) {
        this.make = make;
        this.model = model;
        this.watts = watts;
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

    public Integer getWatts() {
        return watts;
    }

    public void setWatts(Integer watts) {
        this.watts = watts;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Watts", "Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(getWatts()), String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-35s", name));
        }
        builder.append("\n");
        builder.append("-------------------------------------------------------------------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-35s", component));
        }
        builder.append("\n");
        builder.append("-------------------------------------------------------------------------------------------------------------------");

        return builder.toString();
    }
}