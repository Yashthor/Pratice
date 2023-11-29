package com.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[] {2000,3000,4000,5000,9000,3426,2726,3738};
		long startTime = System.currentTimeMillis();
		List<Thread>list = new ArrayList<>();
		Arrays.stream(arr).forEach(i->{
			FactorialMT factorialMT = new FactorialMT(i);
			Thread thread = new Thread(factorialMT);
			thread.start();
			list.add(thread);
		}
		);
		list.stream().forEach(i->{
			try {
				i.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken:" + (endTime-startTime));	

	}

}
