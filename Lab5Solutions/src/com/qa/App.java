package com.qa;

public class App {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("square", "red", 0, 0, 20, 20);
        Rectangle r2 = new Rectangle("rectangle", "blue", 20, 20, 40, 20);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("r1 is square? " + r1.isSquare());
        System.out.println("r2 is square? " + r2.isSquare());

        System.out.println("CENTRE POINT FOR r1: " + r1.getCentrePoint());
        System.out.println("CENTRE POINT FOR r2: " + r2.getCentrePoint());

        System.out.println("AREA FOR r1: " + r1.getArea());
        System.out.println("AREA FOR r2: " + r2.getArea());
    }
}
