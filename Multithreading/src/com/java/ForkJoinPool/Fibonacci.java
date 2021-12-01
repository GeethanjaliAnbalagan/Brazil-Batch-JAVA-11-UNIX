package com.java.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
public class Fibonacci extends ForkJoinTask<Integer> {

    private int input;
    private int sum = 0;

    public Fibonacci(int input) {

        this.input = input;
    }

    @Override
    public Integer getRawResult() {
        if (!isDone())
            return null;
        return sum;
    }

    @Override
    protected void setRawResult(Integer value) {
        this.sum = value;
    }

    @Override
    protected boolean exec() {
        if (input <= 5) {
            sum = seqFib(input);
            return true;
        }

        Fibonacci task1 = new Fibonacci(input - 1);
        Fibonacci task2 = new Fibonacci(input - 2);
        task1.fork();
        sum = task2.invoke() + task1.join();
        return true;
    }

    int seqFib(int n) {
        if (n <= 1)
            return n;
        return seqFib(n - 1) + seqFib(n - 2);
    }
  
  	public static void main(String[] args) {
        Fibonacci task = new Fibonacci(40);
        System.out.println(new ForkJoinPool().invoke(task));
    }
}