package edu.geometry;

import edu.geometry.client.Shape;

import javax.crypto.SecretKey;

public class Triangle implements Shape {
    private final double baseLength;
    private final double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public double area() {
        return getHeight() * getBaseLength() * 0.5;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public double getHeight() {
        return height;
    }
}
