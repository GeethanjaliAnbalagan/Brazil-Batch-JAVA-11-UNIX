package com.java.Comparable;

public class SampleStudentChild implements Comparable<SampleStudentChild> {
	private String name;
	private int age;
	public SampleStudentChild(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return " ";
	}
	public int compareTo(SampleStudentChild str)
	{
		if (this.age== str.age) {
			System.out.println(this.age);
			System.out.println(str.age);
			
			return 0;
			
		}
		else
		{
			System.out.println(this.age);
			System.out.println(str.age);
			return this.age > str.age ? 1: -1;
		}
			
			
		
		
	}
	

}
