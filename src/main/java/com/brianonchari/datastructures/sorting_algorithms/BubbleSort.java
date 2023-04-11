package com.brianonchari.datastructures.sorting_algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort(arr);
        bubbleSort.printArray(arr);

    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
