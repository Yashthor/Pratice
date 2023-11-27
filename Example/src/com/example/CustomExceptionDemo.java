package com.example;

public class CustomExceptionDemo {
	
	public String CheckAge(int age) {
		if(age>18) {
			return "allowed";
		}
		else {
			throw new CustomeException("not allowed");
		}
	}

	public static void main(String[] args) {
		CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
		customExceptionDemo.CheckAge(10);

	}

}
