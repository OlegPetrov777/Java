package com.company.N34;

public abstract class Shape {
    public double volume;


    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        Box box = new Box(10000);

        Pyramid pyramid = new Pyramid(5, 15);
        Ball ball = new Ball(10);
        Cylinder cylinder = new Cylinder(10, 15);

        box.add(pyramid);
        box.add(ball);
        box.add(cylinder);

    }
}
