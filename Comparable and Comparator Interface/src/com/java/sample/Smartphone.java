package com.java.sample;

public class Smartphone implements Comparable<Smartphone> {
	private String name;
	private int storage;
	private int price;
	public Smartphone(String name, int storage, int price) {
		super();
		this.name = name;
		this.storage = storage;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Smartphone [name=" + name + ", storage=" + storage + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Smartphone str) {
		//this>str  + 
		//this<str  -
		//this==str  0
		if (this.getStorage() > str.getStorage()) {
			return 1;
			
		}
		else if (this.getStorage() < str.getStorage()) {
			return -1;
			
		}
		else{
			return 0;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
	