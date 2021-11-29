package com.java.sample;

public class Smartphone1  {
	private String name;
	private int storage;
	private int price;
	public Smartphone1(String name, int storage, int price) {
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
		return "Smartphone1 [name=" + name + ", storage=" + storage + ", price=" + price + "]";
	}
		
	}
	

	
