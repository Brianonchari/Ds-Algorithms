package com.brianonchari.datastructures.recursion;

public class Recursion {
    public static void main(String [] args){
        // Shows how method execution is managed in stack memory
        firstMethod();

        // Recursive methode
        recursiveMethod(4);
    }

   public static void firstMethod(){
        secondMethod();
        System.out.println("I am the first method");
    }

     static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }

    private static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third method");
    }

    private static void fourthMethod() {
        System.out.println("I am the fourth method");
    }

    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less than 1");
        }else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
}
