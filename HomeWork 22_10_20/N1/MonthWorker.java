package com.hw.task1;

public class MonthWorker extends Worker {

    public MonthWorker(int sal, String name) {
        this.sal = sal;
        this.name = name;
        this.id = Worker.workers.size();
        workers.add(this);

    }

    @Override
    int getSal() {
        return sal;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getId() {
        return id;
    }
}

