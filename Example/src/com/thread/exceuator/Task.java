package com.thread.exceuator;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("Hey calling from thread : " + Thread.currentThread().getName());
		
	}
	

}
