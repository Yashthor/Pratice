package com.collection;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {
	
	public void storeKeyword(String key);
	
	public List<String> getStoreKeyword();
	
	default Map<String,Keyword> getAllFrequency() {
		return null;
	}
	
	default List<String> getTop5Record(){
		return null;
	}

}
