package com.company.N34;

public class Ball extends SolidOfRevolution{

    public Ball(double radi) {
        radius = radi;
        volume = (4 * 3.14 * radius * radius * radius) / 3;
    }
}
