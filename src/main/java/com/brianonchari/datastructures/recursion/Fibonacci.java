package com.brianonchari.datastructures.recursion;

public class Fibonacci {
    public static void main(String [] args){
        int n = 10;
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(n);
        var rec = fibonacci.fibonacci2(n);
        System.out.println(rec);
    }

    public  void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < n){
            System.out.println(num1 + "");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

        }
    }

    public int fibonacci2(int n){
        if(n==1 || n ==0){
            return n;
        }

        return fibonacci2(n-1) + fibonacci2(n-2);
    }
}
