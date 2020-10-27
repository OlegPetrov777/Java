/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author alisa
 */
public class Terminal {
    public int numbers;
    public double money;
    public int people;
    public Terminal () {
        this.numbers = 0;
        this.money = 0;
        this.people = 0;
    }
    public void put(Card card) {
        Date date = new Date();
        if (card.month & Long.parseLong(date-card.date)<Long.parseLong(2592000001)) {
            System.out.println("Open");
        } else {
            card.month = false;
            if (card.numbers > 0) {
                card.numbers -= 1;
                System.out.println("Open");
        } else if (card.money >= 60) {
            card.money -= 60;
            System.out.println("Open");
        } else {
            System.out.println("Not enough money");
        }
    }
}
