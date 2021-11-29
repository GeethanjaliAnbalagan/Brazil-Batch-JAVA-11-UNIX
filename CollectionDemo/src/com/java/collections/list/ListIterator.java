package com.java.collections.list;
import java.util.*;
public class ListIterator {
	
	
	   public static void main(String args[]){

	     LinkedList<String> list=new LinkedList<String>();
	     List<Integer> obj = new LinkedList<Integer>();

	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");
	     list.add("Raj");
	     System.out.println(list);

	     //Adding an element to the first position
	     list.addFirst("Negan");
	     System.out.println(list);
	     //Adding an element to the last position
	     list.addLast("Rick");
	     System.out.println(list);
	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");
	     System.out.println(list);
	     //Iterating LinkedList
	     Iterator<String> obj1=list.iterator();
	     while(obj1.hasNext()){
	       System.out.println(obj1.next());
	     }
	     for (String obj2 : list) {
	    	 
	    	 System.out.println("*************");
	    	 System.out.println(obj2);
			
		}
	   } 
	} 


