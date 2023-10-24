package com.computerbuilder.components;

public class Storage {
    private String make;
    private String model;
    private String type; // Constraint: [SSD,HDD]
    private Integer storageCapacity;
    private Double price;


    // Constructors
    public Storage() {} // ctor

    public Storage(String make, String model, String type, Integer storageCapacity, Double price) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.storageCapacity = storageCapacity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("HDD") || type.equals("SSD")) {
            this.type = type;
        } else {
            System.out.println("ERROR: Storage type must be HDD or SSD");
        }
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


    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Type", "Capacity", "Price"};

        String[] dataArray = {getMake(), getModel(), getType(), String.valueOf(getStorageCapacity()), String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-15s", name));
        }
        builder.append("\n");
        builder.append("--------------------------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-15s", component));
        }
        builder.append("\n");
        builder.append("--------------------------------------------------------------------------");

        return builder.toString();
    }
}