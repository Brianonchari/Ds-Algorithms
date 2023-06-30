package com.brianonchari.datastructures.arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
   public static void main(String [] args){
       int[][] int2DArray;
       int2DArray = new int[2][2];

       int2DArray[0][0] = 1;
       int2DArray[0][1] = 2;
       int2DArray[1][0] = 3;
       int2DArray[1][1] = 4;

       System.out.println(Arrays.deepToString(int2DArray));

       //All together
       String s2DArray [][] = {{"a","b"},{"c","d"}};
       System.out.println(Arrays.deepToString(s2DArray));
   }
}
