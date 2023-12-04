package com.thread.exceuator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableTask callableTask = new CallableTask();
		ExecutorService execuatorService = Executors.newFixedThreadPool(2);
		List<Future<String>> result = new ArrayList();
		for(int i=0;i<20;i++) {
			result.add(execuatorService.submit(callableTask));
		}
		System.out.println("started");
		for(Future<String> f: result) {
			System.out.println(f.get());
		}
		System.out.println("done");

	}

}
