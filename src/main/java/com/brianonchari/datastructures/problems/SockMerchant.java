package com.brianonchari.datastructures.problems;

import java.util.HashSet;
import java.util.List;

/*
* There is a large pile of socks that must be paired by color.
*  Given an array of integers representing the color of each sock, determine how many pairs of socks
*  with matching colors there are.
*
* Example
*-------------
* n=7
* ar = [1,2,1,2,1,3,2]
*
* There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color.
*  The number of pairs is 2 .
*
* Function Descpription
* ----------------------
* Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

    int n: the number of socks in the pile
    int ar[n]: the colors of each sock
*
* Returns
* -------------------------
* int: the number of pairs
 * **/
public class SockMerchant {

    public static void main(String[] args) {

        int[] ar = {1,2,1,2,1,3};
        sockMerchant(ar.length,ar);

    }

    public static int sockMerchant(int n,int[] ar) {
        int pairs = 0;
        HashSet<Integer> unmatched = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            if (!unmatched.add(ar[i])) {
                unmatched.remove(ar[i]);
                pairs++;
            }
        }
        System.out.println(pairs);
        return pairs;
    }
}
