package com.computerbuilder.components;

 public class Case {
    public static String[] VALID_SIZES = {"SMALL", "MEDIUM", "LARGE"};
    private String make;
     private String model;
    private CaseSize size; // Constraint: [SML,MED,LRG]
    private Double price;


    // Constructors
    public Case() {
    } // Empty ctor

    public Case(String make, String model, CaseSize size, Double price) {
        this.make = make;
        this.model = model;
        this.size = size;
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

    public CaseSize getSize() {
        return size;
    }

    public void setSize(CaseSize size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Size", "Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(getSize().Name()), String.valueOf(getPrice())};

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