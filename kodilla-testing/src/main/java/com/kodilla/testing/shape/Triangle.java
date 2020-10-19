package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}
