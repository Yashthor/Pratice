package com.thread.exceuator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VoliateTaskMain {
	
	public static void main(String[]args) {
	
	VoliateTask voliateTask1 = new VoliateTask("W");
	VoliateTask voliateTask2 = new VoliateTask("R");
	ExecutorService execuatorService = Executors.newFixedThreadPool(2);
	execuatorService.submit(voliateTask1);
	execuatorService.submit(voliateTask2);
	execuatorService.shutdown();
	}
	

}
