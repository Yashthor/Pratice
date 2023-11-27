package com.example;

public class Logging {
	
	private static Logging instance;
	
	private Logging() {
		
	}
	
	public void info(String msg) {
		System.out.println(msg);
	}
	
	public static Logging getInstance() {
		if(instance==null) {
			instance= new Logging();
			return instance;
		}else {
		return instance;
		}
		
	}
	
	

}
