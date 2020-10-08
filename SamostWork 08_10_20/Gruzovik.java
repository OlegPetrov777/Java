package com.company;

public class Gruzovik extends Car{
    public int sp;
    public int pri;
    public int volume; // объем не машины, а сколько вмещает груза

    public Gruzovik(int volume, int sp, int pri){
        max_speed = 90;
        color = "orange";
        volume = 100;
        KPP = "mehanica";
        place = 1;
        speed_now = sp;
        price = pri;
    }

}
