package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Logging logging = Logging.getInstance();
		logging.info("Object created");
//		int count=1;
//		int max=1;
		 List<Integer> a = new ArrayList<>();
	        a.add(1);
	        a.add(2);
	        a.add(3);
	        a.add(1);
	        a.add(2);
	        a.add(3);
	        a.add(3);
	        a.add(3);
//	        Collections.sort(a);
//	        System.out.print(a);
//	        for(int i=0;i<a.size()-1;i++) {
//	        	if(a.get(i)==a.get(i+1)) {
//	        		count++;
//	        	}
//	        }
//	        if(count>max) {
//                max=count;
//        }
//	        int x  = a.size()-max;
//	        System.out.println(x);
////	        1 2 3 1 2 3 3 3
	        Collections.sort(a);
	        System.out.print(a);
	        int max=1,curr=1;
	        for(int i=0;i<a.size()-1;i++){
	            if(a.get(i)==a.get(i+1)){
	                curr++;
	            }
	            else
	                curr=1;
	            if(curr>max)
	                max=curr;
	        }
//	        return a.size()-max;
//	        System.out.println(a.size()-max);

	    }
//
	
}
