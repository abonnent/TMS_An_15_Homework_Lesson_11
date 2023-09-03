package com.teachmeskills.hw11.exercise02;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getPerimeter() {
        return "Периметр треугольника: " + (this.sideA + this.sideB + this.sideC);
    }
}
