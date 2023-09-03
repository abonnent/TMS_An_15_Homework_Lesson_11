package com.teachmeskills.hw11.exercise02;

public class Shape<T extends Figure> {
    private T[] figures;

    public Shape(T[] figures) {
        this.figures = figures;
    }

    public void showPerimeter() {
        for (T figure : this.figures) {
            System.out.println(figure.getPerimeter());
        }
    }
}
