package com.java.sample;

import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;


public class MainSmartPhone1 
{
	public static void main(String[] args) {
		
		List<Smartphone1> obj = new ArrayList<Smartphone1>();
		obj.add(new Smartphone1("redmi",8,10000));
		obj.add(new Smartphone1("Apple",15,90000));
		obj.add(new Smartphone1("vivo",9,12000));
		obj.add(new Smartphone1("samsung",12,25000));
		
		Comparator<Smartphone1> sm1 = new Comparator<Smartphone1>()
		{
			public int compare(Smartphone1 s1,Smartphone1 s2)
			{
			if(s1.getPrice()> s2.getPrice()) return 1;
			else return -1;
			}
		     };   
		     
		Collections.sort(obj,sm1);
		
          for (Smartphone1 smart : obj) {
			
			System.out.println(smart);
			
		}
		
	}
	}


	