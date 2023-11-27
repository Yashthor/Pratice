package com.example;

public class Employee {
	
	private String name;
	private int id;
	
	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee s = (Employee)obj;
		if(s.name ==this.name && s.id ==this.id) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("yash",12);
		Employee e2 = new Employee("yash",12);
		Employee e3 = new Employee("yash",123);
		System.out.println(e1.equals(e3));
		
		
	}

}
