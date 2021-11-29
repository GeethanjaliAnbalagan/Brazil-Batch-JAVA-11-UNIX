package com.java.Demo;
import java.util.*;


public class Test {
	
	

	public static void main(String[] args) {
		List<LaptopCom> obj = new ArrayList<LaptopCom>();
		obj.add(new LaptopCom("Apple",8,90000));
		obj.add(new LaptopCom("lenavo",4,25000));
		obj.add(new LaptopCom("hp",12,50000));
		Comparator<LaptopCom> obc = new Comparator<LaptopCom>()
				{

					@Override
					public int compare(LaptopCom a1, LaptopCom a2) {
						// TODO Auto-generated method stub
						if (a1.getPrice()>a2.getPrice()) return 2;
						else return -2;
					}
		
				};

		Collections.sort(obj, obc);
		for (LaptopCom lap : obj) {
			System.out.println(lap);
			
		}
	}

}
