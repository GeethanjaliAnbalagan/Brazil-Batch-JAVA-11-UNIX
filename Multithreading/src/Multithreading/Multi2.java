package Multithreading;
//Example of sleep method in java
class Multi2 extends Thread{  
	 public void run()
	 {  
	  for(int i=1;i<5;i++)
	  {  
	    try{
	    
	    	Thread.sleep(5000);       //t1-sleep t2-sleep   t1-wake-1(i++)  t1-sleep t2-awake-1(i++)   t2-sleep   t1-wake-2(i++) 
	    								// t1-sleep  t2-wake-2(i++)   t1-wake-3(i++) t1-sleep t2-wake-3(i++)  t2-sleep t1-wake-4 t2-wake-4
	    }
	    catch(InterruptedException e)   
	    { 
	    	System.out.println(e);
	    	}  
	        System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[])
	 {  
		 Multi2 t1=new Multi2();  
		 Multi2 t2=new Multi2();  
	   
		t1.start();  
		t2.start();  
	
	 }  
	}   












