package com.collection;

import java.util.ArrayList;
import java.util.List;

public class KeyAnalyzerImpl implements KeyAnalyzer {
	
	private List<String> list;
	
	public KeyAnalyzerImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void storeKeyword(String key) {
		// TODO Auto-generated method stub
		list.add(key);
		
	}

	@Override
	public List<String> getStoreKeyword() {
		// TODO Auto-generated method stub
		return list;
	}
	

}
