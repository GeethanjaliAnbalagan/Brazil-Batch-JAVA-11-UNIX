package com.java.sample;

class A
{
	void show() {
	System.out.println("this is from a");
}
}

class B extends A
{
	
}

public class AnonymousClass {
	public static void main(String[] args) {
		
		B obj = new B()
				{

			void show() {
				System.out.println("this is from b");
			}
				};
		obj.show();
		
		System.out.println();
	}

}
