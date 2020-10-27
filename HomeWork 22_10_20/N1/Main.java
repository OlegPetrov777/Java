package com.hw.task1;


import java.util.Comparator;


public class Main {

    public static void main(String[] args) {

	    HourWorker w1 = new HourWorker(10, "Dima");
		MonthWorker w2 = new MonthWorker(1200, "George");
	    MonthWorker w3 = new MonthWorker(1450, "Eugene");
	    HourWorker w4 = new HourWorker(8, "Philipp");
		MonthWorker w5 = new MonthWorker(1200, "Anton");
		MonthWorker w6 = new MonthWorker(1600, "Oleg");
		HourWorker w7 = new HourWorker(15, "Benjamin");
		MonthWorker w8 = new MonthWorker(1120, "Chris");


		Comparator<Worker> compSal = Comparator.comparing(Worker::getSal);
		Comparator<Worker> compName = Comparator.comparing(Worker::getName);

		Worker.workers.sort(compName);
		Worker.workers.sort(compSal.reversed());


		Worker.list();

		Worker.head();
		Worker.tail();
    }
}
