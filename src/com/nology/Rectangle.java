package com.nology;

public class Rectangle extends Shape{

    private int side1;
    private int side2;

    public Rectangle(int numOfSide, int side1, int side2) {
        super(numOfSide);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public long getPerimeter() {
        return 2 * side2 + 2 * side1;
    }
}
