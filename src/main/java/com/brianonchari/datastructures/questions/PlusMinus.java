package com.brianonchari.datastructures.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 *
 * Example
 *
 * There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 *
 * 0.400000
 * 0.400000
 * 0.200000
 * Function Description
 *
 * Complete the plusMinus function in the editor below.
 *
 * plusMinus has the following parameter(s):
 *
 * int arr[n]: an array of integers
 * Print
 * Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.
 *
 * Input Format
 *
 * The first line contains an integer, , the size of the array.
 * The second line contains  space-separated integers that describe .
 *
 * Constraints
 * 0<n<=10
 * -100<=arr[i]<=100
 *
 *
 * Output Format
 *
 * Print the following  lines, each to  decimals:
 *
 * proportion of positive values
 * proportion of negative values
 * proportion of zeros
 * Sample Input
 *
 * STDIN           Function
 * -----           --------
 * 6               arr[] size n = 6
 * -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
 * Sample Output
 *
 * 0.500000
 * 0.333333
 * 0.166667
 * Explanation
 *
 * There are  positive numbers,  negative numbers, and  zero in the array.
 * The proportions of occurrence are positive: , negative:  and zeros: .
 */

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        plusMinus(arr);

    }


    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int arrSize = arr.size();
        long positive = arr.stream().filter(i-> i>0).count();
        long negative = arr.stream().filter(i-> i<0).count();
        long zero = arr.stream().filter(i-> i ==0).count();

        double positiveRatio = (double) positive/arrSize;
        double negativeRatio = (double) negative/arrSize;
        double zeroRatio = (double) zero/arrSize;


        System.out.printf("%.6f\n",positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n",zeroRatio);

    }
}
