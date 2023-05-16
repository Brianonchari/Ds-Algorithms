package com.brianonchari.datastructures.arrays;

import java.util.Arrays;

public class SingleDimensionArrays {
    int arr[] = null;

    public SingleDimensionArrays(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
                System.out.println(Arrays.toString(arr));
            } else {
                System.out.println("This index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index to access an array!");
        }
    }  // The time complexity of this insert function is O(1) constant
    // because it's not dependent on input size
}
