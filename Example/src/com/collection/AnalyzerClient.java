package com.collection;

public class AnalyzerClient {
	
	public static void main(String[]args) {
		KeyAnalyzer keyAnalyzer = new KeyAnalyzerImpl();
		keyAnalyzer.storeKeyword("pen");
		keyAnalyzer.storeKeyword("pencil");
		keyAnalyzer.storeKeyword("book");
		keyAnalyzer.storeKeyword("table");
		keyAnalyzer.storeKeyword("chair");
//		System.out.println(keyAnalyzer.getStoreKeyword());
		
		KeyAnalyzer keyAnalyzer2 = new MapKeyAnalyzer();
		keyAnalyzer2.storeKeyword("pen");
		keyAnalyzer2.storeKeyword("pencil");
		keyAnalyzer2.storeKeyword("book");
		keyAnalyzer2.storeKeyword("table");
		keyAnalyzer2.storeKeyword("chair");
		keyAnalyzer2.storeKeyword("pen");
		keyAnalyzer2.storeKeyword("pen");
		keyAnalyzer2.storeKeyword("chair");
		System.out.println(keyAnalyzer2.getStoreKeyword());
		System.out.println(keyAnalyzer2.getAllFrequency());
		System.out.println(keyAnalyzer2.getTop5Record());
		
		
	}

}
