package com.thread.exceuator;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		int corePoolSize = 4;
		int maxPoolSize = 10;
		Task task = new Task();
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maxPoolSize,
				30L,TimeUnit.SECONDS,new LinkedBlockingQueue<>());
		for(int i=0;i<20;i++) {
			threadPoolExecutor.submit(task);
		}
		threadPoolExecutor.shutdown();  // all task done shut down the process
//		threadPoolExecutor.submit(task);
//		threadPoolExecutor.shutdownNow(); // shut down now
		threadPoolExecutor.awaitTermination(1, TimeUnit.MICROSECONDS);
		System.out.println("done");
		

	}

}
