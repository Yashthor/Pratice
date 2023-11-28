package com.thread;

public class Task implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("yash" + Thread.currentThread());
		
	}
	

}
