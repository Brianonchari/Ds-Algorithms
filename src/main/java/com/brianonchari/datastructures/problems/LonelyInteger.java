/*
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 * Example a = [1,2,3,4,3,2,1] The unique element is 4
 *
 * <p>Function Description
 *
 * <p>Complete the lonelyinteger function in the editor below.
 *
 * <p>lonelyinteger has the following parameter(s):
 *
 * <p>- int a[n]: an array of integers
 *
 * <p>Returns - int: the element that occurs only once
 *
 * <p>Input Format
 *
 * <p>The first line contains a single integer, n , the number of integers in the array. The second
 * line contains n space-separated integers that describe the values in a .
 */
package com.brianonchari.datastructures.problems;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LonelyInteger {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/onchari/text.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = lonelyInteger(a);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }

  public static int lonelyInteger(List<Integer> arr) {
    Collections.sort(arr);
    int lonelyInt = 0;
    for (int i = 0; i < arr.size(); i++) {
      lonelyInt ^= arr.get(i);
    }
    return lonelyInt;
  }
}
