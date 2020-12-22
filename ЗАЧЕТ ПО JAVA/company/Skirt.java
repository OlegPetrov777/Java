package com.company;

public class Skirt extends Clothes implements Women_clothes{
    String name;

    public Skirt(){}
    public Skirt(String name){this.name = name;}

    @Override
    public void dressWomen(){
        System.out.println("Женская одежда");
    }
}
