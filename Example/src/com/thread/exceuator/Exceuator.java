package com.thread.exceuator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exceuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task = new Task();
		ExecutorService execuatorService = Executors.newFixedThreadPool(5);
		ScheduledExecutorService scheduleExecutorService = Executors.newScheduledThreadPool(1);
		scheduleExecutorService.schedule(task, 10, TimeUnit.SECONDS);
		for(int i=0;i<20;i++) {
			execuatorService.submit(task);
		}
		

	}

}
