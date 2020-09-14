package com.company.N34;

public class Box extends Shape{

    public Box(double vol) {
        volume = vol;
    }

    public boolean add(Shape del) {
        if (volume - del.getVolume() < 0){
            System.out.println("Недостаточно места в коробке (Box)");
            return false;
        }
        else {
            volume -= del.getVolume();
            System.out.println("Осталось ещё " + volume);
            return true;
        }

    }
}
