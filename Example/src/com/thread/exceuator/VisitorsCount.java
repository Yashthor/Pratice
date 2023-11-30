package com.thread.exceuator;

public class VisitorsCount implements Runnable {
	
	private int visitors;
	
	public VisitorsCount() {
		this.visitors=0;
	}

	@Override
	public void run() {
		visitors++;
		
	}

	public int getVisitors() {
		return visitors;
	}
	
}
