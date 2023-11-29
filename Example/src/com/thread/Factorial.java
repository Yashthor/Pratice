package com.thread;

import java.math.BigInteger;
import java.util.Arrays;

public class Factorial {
	
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {2000,3000,4000,5000};
		long startTime = System.currentTimeMillis();
		Arrays.stream(arr).parallel().map(i->getFactorial(i)).forEach(i->System.out.println(i));
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken:" + (endTime-startTime));	
	}
	
	public static BigInteger getFactorial(int num) {
		BigInteger result = BigInteger.ONE;
		for(int i=2;i<=num;i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}		
		return result;		
	}

}
