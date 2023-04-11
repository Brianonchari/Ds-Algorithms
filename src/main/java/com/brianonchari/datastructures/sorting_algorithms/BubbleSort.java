package com.brianonchari.datastructures.sorting_algorithms;

public class BubbleSort {

    public static void main(String[] args){
        int arr[] = {9,1,3,4,5,78};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort(arr);
        bubbleSort.printArray(arr);

    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
