package com.qa;

public class Rectangle extends Shape {


    private int height;
    private int width;

    public Rectangle(String name, String colour, double x, double y, int width, int height) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    public boolean isSquare() {
        return height == width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double x = getX() + (width / 2);
        double y = getY() + (height / 2);
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
