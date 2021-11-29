package com.java.sample;

class A1
{
	
	void show()
	{
		System.out.println("This is A block");

	}
}

class B1 extends A1
{
	
	
}
public class Ananymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1()
				{
			void show()
			{
				System.out.println("This is B block");

			}
			
			
				};
		obj.show();
		System.out.println();

	}

}
