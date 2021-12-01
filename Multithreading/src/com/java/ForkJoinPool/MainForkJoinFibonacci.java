package com.java.ForkJoinPool;



	import java.util.concurrent.ForkJoinPool;

	public class MainForkJoinFibonacci {

	    public static void main(String[] args) {

	        ForkJoinFibonacci task = new ForkJoinFibonacci(5);
	        new ForkJoinPool().invoke(task);

	        System.out.println(task.getNumber());

	    }

	}