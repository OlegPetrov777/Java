package com.hw.task1;

public class HourWorker extends Worker {

    public HourWorker(int sal, String name) {
        this.sal = sal;
        this.name = name;
        this.id = Worker.workers.size();
        workers.add(this);

    }

    @Override
    int getSal() {
        return (int)(20.8 * 8 * sal);
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
