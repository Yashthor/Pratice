package com.fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[]args) throws IOException, ClassNotFoundException {
		Person p = new Person("Yash",10);
		WriteDataTOFile(p);
		ReadDataFromFile();
	}
	
	public static void ReadDataFromFile() throws IOException, ClassNotFoundException {
		FileInputStream fileOutputStream = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Example\\src\\com\\fileStream\\Demo.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileOutputStream);
		System.out.println(inputStream.readObject());
	}
	
	public static void WriteDataTOFile(Person p) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\dell\\eclipse-workspace\\Example\\src\\com\\fileStream\\Demo.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(p);
		System.out.println("done");
	}

}
