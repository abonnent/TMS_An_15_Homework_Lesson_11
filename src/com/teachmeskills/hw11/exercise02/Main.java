package com.teachmeskills.hw11.exercise02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = getFigures();

        Shape<Figure> shapes = new Shape(figures);
        shapes.showPerimeter();
    }

    public static Figure[] getFigures() {
        return new Figure[]{
                new Circle(5),
                new Rectangle(7, 4),
                new Triangle(3, 4, 5),
        };
    }
}
