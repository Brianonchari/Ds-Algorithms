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

    /*The time complexity of this insert function is O(1) constant
    / because it's not dependent on input size. It always takes the same amount of time to insert
    / an element to an array index
    .*/
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
    }


    /*
     *Array Traversal
     * --------------
     * The time complexity of the function below is O(N) because we have to loop
     * through the size N of the array. In this case N is the size of array arr[].
     *
     * The space complexity is constant O(1). An extra memory is not required.
     */
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception exception) {
            System.out.println("Array no longer exists");
        }
    }

    /*
     *Search  for ab element in a given array
     * The time  complexity of this search method is O(N), because it is dependent on the
     * size of the array
     * The space complexity is O(1)
     */

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value " + valueToSearch + " found at index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " not found");
    }
}
