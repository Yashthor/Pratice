package com.thread.exceuator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorsCountDemo {

	public static void main(String[] args) throws InterruptedException {
		VisitorsCount visitorsCount = new VisitorsCount();
		ExecutorService execuatorService = Executors.newFixedThreadPool(4);
		for(int i=0;i<2000;i++) {
			execuatorService.submit(visitorsCount);
		}
		execuatorService.shutdown();
		execuatorService.awaitTermination(1, TimeUnit.MILLISECONDS);
		System.out.println("Total number of persons inside party hall is: " + visitorsCount.getVisitors());

	}

}
