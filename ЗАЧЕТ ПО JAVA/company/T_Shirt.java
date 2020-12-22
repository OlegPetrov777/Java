package com.company;

public class T_Shirt extends Clothes implements Man_clothes{
    String name;

    public T_Shirt(){}
    public T_Shirt(String name){this.name = name;}

    @Override
    public void dressMan(){
        System.out.println("Мужская одежда");
    }
}
