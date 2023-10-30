package com.computerbuilder.components;

public enum CaseSize {
    SMALL("sml"),
    MEDIUM("med"),
    LARGE("lrg");

    private String name;
    CaseSize(String name) {
        this.name = name;
    }
    public String Name() {
        return name;
    }
}
