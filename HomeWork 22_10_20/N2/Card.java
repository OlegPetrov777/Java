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
import java.util.*;

public class Card {
    public String type;
    public boolean month;
    public int numbers;
    public double money;
    public Date date;
    public Card(String type) {
        this.type = type;
        this.month = false;
        this.numbers = 0;
        this.money = 0;
        this.date = new Date();
    }
    public void addmonth () {
        if (this.type.equals("Social")) {
            this.month = true;
            this.date = new Date();
        } else if (this.type.equals("School")) {
            if (this.money < 1500) {
                System.out.print("Not enough money");
            } else {
                this.money -= 1500;
                this.month = true;
                this.date = new Date();
            }
        } else if (this.type.equals("Student")) {
            if (this.money < 1000) {
                System.out.print("Not enough money");
            } else {
                this.money -= 1000;
                this.month = true;
                this.date = new Date();
            }
    } else {
            if (this.money < 2000) {
                System.out.print("Not enough money");
            } else {
                this.money -= 2000;
                this.month = true;
                this.date = new Date();
            }
        }
}
    public void addmoney(double n, Smartphone s) {
        if (s.money < n) {
            System.out.println("Not enough money");
        } else {
        this.money += n; 
        s.money -= n;
        }
    }
    public void addmoney(double n, Atm t) {
        if (t.money < n) {
            System.out.println("Not enough money");
        } else {
        this.money += n; 
        t.money -= n;
        }
    }
    public void addnumber (int n) {
        if (this.money < 50*n) {
            System.out.println("Not enough money");
    } else {
            this.money -= 50*n;
            this.numbers += n;
        }
} }
