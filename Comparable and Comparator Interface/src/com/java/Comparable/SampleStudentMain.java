package com.java.Comparable;

public class SampleStudentMain {
	public static void main(String[] args) {
		
		SampleStudentChild s1 = new SampleStudentChild("geetha",25);
		SampleStudentChild s2 = new SampleStudentChild("sanjith",5);
		SampleStudentChild s3 = new SampleStudentChild("sanjith",15);
		int comp = s1.compareTo(s3);
		switch (comp) {
		case -1: {
			
			System.out.println(s2.getName());	
			break;
			}
case 1: {
			
			System.out.println(s1.getName());	
			break;
			}
		default:
			System.out.println("two persons have same value");


		}
		
	}

}
