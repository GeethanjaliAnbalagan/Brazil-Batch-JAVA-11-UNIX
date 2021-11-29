package com.java.sampledemo;

import java.util.*;


public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		List<Integer> obj1 = new ArrayList<Integer>();
		obj.add("gee");
		obj.add("sang");
		obj.add("sanjith");
		System.out.println(obj);
		obj.add(1, "anbu");
		System.out.println(obj);

		for (String strobj : obj) {
			System.out.println(strobj);

		}
		obj1.add(24);
		obj1.add(14);
		obj1.add(45);
		obj1.add(24);
		System.out.println(obj1);
		obj1.set(0, 77);
		System.out.println(obj1);
		obj1.add(0, 88);
		System.out.println(obj1);

		obj1.remove(3);

		System.out.println(obj);
		for (Integer intobj : obj1) {

			System.out.println(intobj);

		}
		System.out.println("List String size" +obj.size());
		System.out.println("List Integer size" +obj1.size());
		
		Collections.sort(obj);
		for (String sobj : obj) {
			System.out.println(sobj);
			
		}
		
		Collections.sort(obj1);
		for (Integer inobj : obj1) {
			System.out.println(inobj);
			
		}
		
		
	}

}
