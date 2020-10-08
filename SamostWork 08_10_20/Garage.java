package com.company;

public class Garage extends Car{

    public Garage (int pl){place = pl; }

    public boolean add(Car del){
        if (place - del.getPlace() < 0){
            System.out.println("Недостаточно места в гараже (Box)");
            return false;
        }
        else {
            place -= del.getPlace();
            System.out.println("Осталось ещё " + place);
            return true;
        }

    }
}
