package com.collection;

public class Keyword {
	
	private String key;
	
	private Integer count;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Keyword(String key, Integer count) {
		super();
		this.key = key;
		this.count = count;
	}

	public Keyword() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Keyword [key=" + key + ", count=" + count + "]";
	}
	
	

}
