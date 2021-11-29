package com.java.sampledemo;


import java.util.*;

public class TestCollLL {
public static void main(String[] args) {
	
	
	HashSet<String> hobj = new HashSet<String>();
	Set<String> hobj1 = new HashSet<String>();
	
	LinkedHashSet<String> lobj = new LinkedHashSet<String>();
	Set<String> lobj1 = new LinkedHashSet<String>();
	
	
	LinkedList<String> obj = new LinkedList<String>();
	List<String> obj1 = new LinkedList<String>();
	obj.add("gee");
	obj.add("renu");
	obj.add("san");
	obj.add("ram");
	System.out.println(obj);
	obj.add(2, "bob");
	System.out.println(obj);
	Iterator<String> iobj = obj.iterator();
	while(iobj.hasNext())
	{
		System.out.println(iobj.next());
		
	}
	System.out.println(obj.contains("gee"));
	
	
}
}
