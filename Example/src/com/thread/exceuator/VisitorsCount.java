package com.thread.exceuator;

public class VisitorsCount implements Runnable {
	
	private int visitors;
	
//	private AtomicInteger visitors;
	
	public VisitorsCount() {
		this.visitors=0;
//		this.visitors = new AtomicInteger(0);
	}

	@Override
	public void run() {
//		visitors++;
//		visitors.getAndAdd(1);
		getAndAdd();
		
	}

	public int getVisitors() {
		return visitors;
//		return visitors.get();
	}
	
	public synchronized void getAndAdd() {
		visitors++;
	}
	
}
