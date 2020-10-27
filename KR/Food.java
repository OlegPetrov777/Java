package com.company;

import java.util.ArrayList;

public class Food {
    public int price, val;
    public String edismer, sostav;
    public boolean status;

    public Food(int price, String edismer, int val, String sostav, boolean status) {
        this.price = price;
        this.edismer = edismer;
        this.val = val;
        this.sostav = sostav;
        this.status = status;
    }
    static ArrayList<Food> foods = new ArrayList<>();
}
