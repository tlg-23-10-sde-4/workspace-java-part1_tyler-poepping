package com.computerbuilder.components;

public class Processor {
    private String make;
    private String model;
    private Integer cores;
    private Double price;


    // Constructors
    public Processor() {} //Empty Contructor

    public Processor(String make, String model, Integer cores, Double price) {
        this.make = make;
        this.model = model;
        this.cores = cores;
        this.price = price;
    }


    //Getter and Setters
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

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Cores", "Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(getCores()), String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-15s", name));
        }
        builder.append("\n");
        builder.append("-----------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-15s", component));
        }
        builder.append("\n");
        builder.append("-----------------------------------------------------------");

        return builder.toString();
    }
}