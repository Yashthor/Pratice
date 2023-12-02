package com.thread.exceuator;

public class VoliateTask implements Runnable {
	
	private  volatile static int value = 0;
	
	private String type;
	
	public VoliateTask(String type) {
		this.type = type;
	}

	@Override
	public void run() {
		if(type=="W") {
			while(value!=5) {
				value++;
				System.out.println("Writing value :" + value);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		else {
			int temp=0;
			while(true) {
				if(temp!=value) {
					temp=value;
					System.out.println("Reading value :" + value);
				}
			}
		}
		
	}

}
