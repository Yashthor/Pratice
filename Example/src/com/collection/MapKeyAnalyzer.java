package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MapKeyAnalyzer implements KeyAnalyzer {
	
	private Map<String,Keyword> hmap;
	
	private Queue<Keyword> queue;
	
	public MapKeyAnalyzer() {
		hmap = new HashMap<>();
		queue = new PriorityQueue<>(new Comparator<Keyword>() {
			
			@Override
			public int compare(Keyword o1, Keyword o2) {
				if(o2.getCount()-o1.getCount()>0) {
					return 1;
				}else if(o2.getCount()-o1.getCount()<0) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		
				
		
			
			
	}

	@Override
	public void storeKeyword(String key) {
		int count =1;
		if(hmap.containsKey(key)) {
			Keyword keyword = hmap.get(key);
			queue.remove(keyword);
			count = keyword.getCount()+1;
			keyword.setCount(count);		
			hmap.put(key, keyword);
			queue.add(keyword);
		}
		else {
			Keyword keyword = new Keyword(key,count);
			hmap.put(key, keyword);
			queue.add(keyword);
		}
		
	}

	@Override
	public List<String> getStoreKeyword() {
		List<String>list = new ArrayList<>();
		for(Map.Entry<String, Keyword>record: hmap.entrySet()) {
			list.add(record.getKey());
		}

		return list;
	}
	
	@Override
	public Map<String,Keyword> getAllFrequency() {
		return hmap;
	}
	
	@Override
	public List<String> getTop5Record(){
		List<String> list = new ArrayList<>();
		for(int i =0;i<=4;i++) {
			list.add(queue.poll().getKey());
		}
		return list;
	}

	


}
