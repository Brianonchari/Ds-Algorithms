package com.brianonchari.datastructures.problems;
/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by
 * summing exactly four of the five integers. Then print the respective minimum and maximum values
 * as a single line of two space-separated long integers.
 *
 * <p>Example arr = [1,3,5,7,9]
 *
 * <p>The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9 = 24 . The function prints
 *
 * <p>16 24 Function Description
 *
 * <p>Complete the miniMaxSum function in the editor below.
 *
 * <p>miniMaxSum has the following parameter(s):
 *
 * <p>arr: an array of 5 integers Print
 *
 * <p>Print two space-separated integers on one line: the minimum sum and the maximum sum of 4 of
 * elements.
 *
 * <p>Input Format
 *
 * <p>A single line of five space-separated integers.
 *
 * <p>Constraints
 *
 * <p>Output Format
 *
 * <p>Print two space-separated long integers denoting the respective minimum and maximum values
 * that can be calculated by summing exactly four of the five integers. (The output can be greater
 * than a 32 bit integer.)
 *
 * <p>Sample Input
 *
 * <p>1 2 3 4 5 Sample Output
 *
 * <p>10 14 Explanation
 *
 * <p>The numbers are , , , , and . Calculate the following sums using four of the five integers:
 *
 * <p>Sum everything except , the sum is . Sum everything except , the sum is . Sum everything
 * except , the sum is . Sum everything except , the sum is . Sum everything except , the sum is .
 * Hints: Beware of integer overflow! Use 64-bit Integer.
 */
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    long minSum = 0;
    long maxSum = 0;
    //        // Write your code here
    //        List<Integer> sorted = new ArrayList<>(arr);
    //        Collections.sort(sorted);
    //        System.out.println("Sorted List" + sorted);
    //
    //        // calculate min sum
    //        for(int i = 0;i<arr.size();i++){
    //            minSum += arr.get(i);
    //        }
    //
    //
    //        for(int i = 1;i<arr.size();i++){
    //            maxSum += arr.get(i);
    //        }

    // Calculate the minimum sum

    for (int i = 0; i < arr.size() - 1; i++) {
      minSum += arr.get(i);
    }

    // Calculate the maximum sum

    for (int i = arr.size() - 1; i >= arr.size() - 4; i--) {
      maxSum += arr.get(i);
    }

    // Print the results
    System.out.println(minSum + " " + maxSum);

    System.out.printf("Min Sum : %d\n", minSum);
    System.out.printf("Max Sum : %d\n", maxSum);
  }
}

public class MiniMaxSum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.miniMaxSum(arr);

    bufferedReader.close();
  }
}
