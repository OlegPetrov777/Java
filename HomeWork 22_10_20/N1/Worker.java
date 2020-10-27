package com.hw.task1;

import java.util.ArrayList;


public abstract class Worker {


    int sal;
    String name;
    int id;


    abstract int getSal();
    abstract String getName();
    abstract int getId();

    static ArrayList<Worker> workers = new ArrayList<>();

    @Override
    public String toString() {
        return "Worker{" +
                "monthSal=" + getSal() +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    static public void list() {
        for (int i = 0; i < Worker.workers.size(); i++) {
            System.out.println(Worker.workers.get(i).toString());
        }
    }

    static public void head() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Worker.workers.get(i).getName());
        }
    }

    static public void tail() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Worker.workers.get(i).getId());
        }
    }
}
