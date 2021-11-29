package com.java.sampledemo;
import java.util.*;
public class FirstArrayList {
	public static void main(String[] args) {
		TreeSet<String> obj = new TreeSet<String>();
		Set<String> obj1 = new TreeSet<String>();
		
		obj.add("zebra");
		obj.add("Lion");
		obj.add("Wolf");
		obj.add("Elephant");
		obj.add("Lion");
		obj.add("Elephant");
		
		
		System.out.println(obj);
		//Collections.sort(obj);
		//System.out.println(obj);
		//obj.remove(2);
		//System.out.println(obj);
		for (String str : obj) {
			System.out.println(str);
			
		}
		
		Iterator iobj = obj.iterator();
		while(iobj.hasNext()) {
			
			System.out.println(iobj.next());
		}

	}

}
