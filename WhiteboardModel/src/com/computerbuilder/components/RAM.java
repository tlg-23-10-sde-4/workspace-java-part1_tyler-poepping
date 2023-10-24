package com.computerbuilder.components;

public class RAM {
    private String make;
    private String model;
    private Integer storageCapacity;
    private Double price;
    private Boolean isSetOfTwo;
    private Boolean isSetOfFour;


    // Constructors
    public RAM() {} // Empty ctor

    public RAM(String make, String model, Integer storageCapacity, Double price, Boolean isSetOfTwo, Boolean isSetOfFour) {
        this.make = make;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;
        this.isSetOfTwo = isSetOfTwo;
        this.isSetOfFour = isSetOfFour;
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

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getSetOfTwo() {
        return isSetOfTwo;
    }

    public void setSetOfTwo(Boolean setOfTwo) {
        isSetOfTwo = setOfTwo;
    }

    public Boolean getSetOfFour() {
        return isSetOfFour;
    }

    public void setSetOfFour(Boolean setOfFour) {
        isSetOfFour = setOfFour;
    }

    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Capacity", "Set of Two", "Set of Four " ,"Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(getStorageCapacity())+"gb", String.valueOf(getSetOfTwo()), String.valueOf(getSetOfFour()), String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-15s", name));
        }
        builder.append("\n");
        builder.append("----------------------------------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-15s", component));
        }
        builder.append("\n");
        builder.append("----------------------------------------------------------------------------------");

        return builder.toString();
    }
}