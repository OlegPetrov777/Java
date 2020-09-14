package com.company.N34;

public class Cylinder extends SolidOfRevolution{
    public double height;

    public Cylinder(double radi, double height) {
        radius = radi;
        this.height = height;
        volume = 3.14 * radius * radius * height;
    }
}
