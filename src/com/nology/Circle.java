package com.nology;

public class Circle extends Shape{
    private int radius;

    public Circle(int numOfSide, int radius) {
        super(numOfSide);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * radius * radius * 100) / 100;
    }

    @Override
    public long getPerimeter() {
        return Math.round(2*Math.PI * radius);
    }
}
