package com.company;

// ШТАНЫ
public class Pants extends Clothes implements Man_clothes, Women_clothes{
    String name;

    public Pants(){}
    public Pants(String name){this.name = name;}

    @Override
    public void dressMan(){
        System.out.println("Мужская одежда");
    }

    @Override
    public void dressWomen(){
        System.out.println("Женская одежда");
    }
}
