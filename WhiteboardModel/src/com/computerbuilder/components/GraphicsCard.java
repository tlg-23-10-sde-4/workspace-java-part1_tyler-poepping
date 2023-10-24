package com.computerbuilder.components;

public class GraphicsCard {
    public static final Integer MAX_DISPLAYPORTS = 6;
    public static final Integer MIN_DISPLAYPORTS = 0;
    public static final Integer MAX_HDMIPORTS = 6;
    public static final Integer MIN_HDMIPORTS = 0;
    private String make;
    private String model;
    private Integer displayPorts; // Constraints [1-6]
    private Integer hdmiPorts; // Constraints [1-6]
    private Double price;


    // Constructors
    public GraphicsCard() {} // Empty ctor

    public GraphicsCard(String make, String model, Integer displayPorts, Integer hdmiPorts, Double price) {
        this.make = make;
        this.model = model;
        this.displayPorts = displayPorts;
        this.hdmiPorts = hdmiPorts;
        this.price = price;
    }


    // Getters and setters
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

    public Integer getDisplayPorts() {
        return displayPorts;
    }

    public void setDisplayPorts(Integer displayPorts) {
        if(displayPorts < MIN_DISPLAYPORTS || displayPorts > MAX_DISPLAYPORTS) {
            System.out.println("ERROR: DisplayPort value must be between 1 and 6");
        } else {
            this.displayPorts = displayPorts;
        }
    }

    public Integer getHdmiPorts() {
        return hdmiPorts;
    }

    public void setHdmiPorts(Integer hdmiPorts) {
        if(hdmiPorts < MIN_HDMIPORTS || hdmiPorts > MAX_HDMIPORTS) {
            System.out.println();
            System.out.println("ERROR: hdmiPort value must be between 1 and 6");
            System.out.println();
        } else {
            this.hdmiPorts = hdmiPorts;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    // To String
    public String toString() {
        String[] headerArray = {"Make", "Model", "Display Ports", "HDMI Ports", "Price"};

        String[] dataArray = {getMake(), getModel(), String.valueOf(getDisplayPorts()), String.valueOf(getHdmiPorts()) ,String.valueOf(getPrice())};

        StringBuilder builder = new StringBuilder();

        for (String name : headerArray) {
            builder.append(String.format("%-19s", name));
        }
        builder.append("\n");
        builder.append("-----------------------------------------------------------------------------------");
        builder.append("\n");

        for (String component : dataArray) {
            builder.append(String.format("%-19s", component));
        }
        builder.append("\n");
        builder.append("-----------------------------------------------------------------------------------");

        return builder.toString();
    }
}