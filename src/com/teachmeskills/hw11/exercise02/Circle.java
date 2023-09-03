package com.teachmeskills.hw11.exercise02;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getPerimeter() {
        return "Периметр круга: " + (2 * Math.PI * this.r);
    }
}
