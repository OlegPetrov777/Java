package com.company;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage(10);

        Lada lada =new Lada(60, 100000, "white");
        Gruzovik gruzovik = new Gruzovik(65, 40, 200000);

        garage.add(lada);
        garage.add(gruzovik);

    }
}
