package com.kodilla.testing.shape;

public class Square implements Shape {

    private int a;
    private int b;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}
