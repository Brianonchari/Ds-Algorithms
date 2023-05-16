package com.brianonchari.datastructures.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        SingleDimensionArrays sda = new SingleDimensionArrays(10);
        sda.insert(0,1);
        sda.insert(0,1); // This index is already occupied
        sda.insert(1,2);
        sda.insert(2,3);
        sda.insert(3,4);
        sda.insert(4,5);
        sda.insert(5,6);
        sda.insert(6,7);
        sda.insert(7,8);
        sda.insert(8,9);
        sda.insert(9,10);
        sda.insert(10,11); // Throws exception : ArraysIndexOutOfBoundException

        var firstElement = sda.arr[0];  // --------------O(1) Time Complexity to access an index
        // Space complexity is also O(1) because an extra memory is not required
        System.out.println("Accessed element is "+firstElement);

    }
}
