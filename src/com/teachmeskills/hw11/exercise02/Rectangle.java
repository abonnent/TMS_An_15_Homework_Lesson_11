package com.teachmeskills.hw11.exercise02;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getPerimeter() {
        return "Периметр прямоугольника: " + (2 * this.sideA + 2 * this.sideB);
    }
}
