package com.thread;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("inside main class" + Thread.currentThread());
//		thread.start(); calling same thread which status is not free
		
		Task2 task2 = new Task2();
		task2.start();
		System.out.println("inside main class" + Thread.currentThread());
	}

}
