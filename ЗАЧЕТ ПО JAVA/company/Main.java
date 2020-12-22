package com.company;

public class Main {

    public static void main(String[] args) {
        Clothes_Size xxs = new Clothes_Size("XXS", 32);
        Clothes_Size xs = new Clothes_Size("XS", 34);
        Clothes_Size s = new Clothes_Size("S", 36);
        Clothes_Size m = new Clothes_Size("M", 38);
        Clothes_Size l = new Clothes_Size("L", 40);

        Enumeration enumeration = new Enumeration();
        System.out.println(enumeration.getDescription(s.getSize()));
        System.out.println(enumeration.getDescription(xxs.getSize()));
        System.out.println(enumeration.getDescription("SSS"));


    }
}
