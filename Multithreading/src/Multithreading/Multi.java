package Multithreading;

//Java Thread Example by extending Thread class

class Multi extends Thread
{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi(); 
Multi t2=new Multi(); 

t1.start();
t2.start();


 }  
}  
