package com.java.sample;

import java.util.*;


public class MainSmartPhone {
	public static void main(String[] args) {
		
		List<Smartphone> obj = new ArrayList<Smartphone>();
		obj.add(new Smartphone("redmi",8,10000));
		obj.add(new Smartphone("Apple",15,90000));
		obj.add(new Smartphone("vivo",9,12000));
		obj.add(new Smartphone("samsung",12,25000));
		Collections.sort(obj);
		for (Smartphone smart : obj) {
			
			System.out.println(smart);
			
		}
		
	}
}
		
	
	

	
			
		
		

