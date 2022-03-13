package com.nology;

public class Square extends Shape {

    private int side;

    public Square(int numOfSide, int sideLength) {
        super(numOfSide);
        this.side = sideLength;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public long getPerimeter() {
        return 4 * side;
    }
}
