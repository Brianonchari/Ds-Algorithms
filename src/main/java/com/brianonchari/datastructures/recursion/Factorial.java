package com.brianonchari.datastructures.recursion;

public class Factorial {
    public static void main(String [] args){
        Factorial factorial = new Factorial();
        var rec = factorial.factorial(5);
        System.out.println(rec);
    }

    public int factorial(int n){
        if(n==1 || n ==0){
            return 1;
        }else
        {
            return n* factorial(n-1);
        }
    }
}
