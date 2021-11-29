package com.java.Comparable;

//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface  
import java.util.*;  
import java.io.*;  
class Student implements Comparable<Student>{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
public int compareTo(Student st){  
if(age==st.age)
{
	System.out.println(age);
	System.out.println(st.age);
	return 0; 
	
}
 else if(age>st.age) 
 {
		System.out.println(age);
		System.out.println(st.age);
		return 1; 
 }
 
else 
{
	System.out.println(age);
	System.out.println(st.age);
return -1; 
}
}  
}  
