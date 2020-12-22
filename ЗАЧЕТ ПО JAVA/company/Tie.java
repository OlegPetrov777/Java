package com.company;

// ГАЛСТУК
public class Tie extends Clothes implements Man_clothes{
    String name;

    public Tie(){}
    public Tie(String name){this.name = name;}

    @Override
    public void dressMan(){
        System.out.println("Мужская одежда");
    }
}
