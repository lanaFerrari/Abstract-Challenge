package com.nology;

public abstract class Shape {
    private int numOfSide;

    public Shape(int numOfSide) {
        this.numOfSide = numOfSide;
    }

    public void setNumOfSide(int numOfSide) {
        this.numOfSide = numOfSide;
    }

    public abstract double getArea();
    public abstract long getPerimeter();
}

