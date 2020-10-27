/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author alisa
 */
public class Smartphone {
    public double money;
    public Smartphone() {
        this.money = 0;
    }
    public void addmoney(double n, Atm t) {
        if (t.money < n) {
            System.out.println("Not enough money");
        } else {
        this.money += n; 
        t.money -= n;
        }
    }
}
