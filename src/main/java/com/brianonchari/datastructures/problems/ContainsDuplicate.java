/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums= [1, 2, 3, 4]
 * Output: false
 * Explanation: There are no duplicates in the given array.
 * Example 2:
 *
 * Input: nums= [1, 2, 3, 1]
 * Output: true
 * Explanation: '1' is repeating.
 *
 */

package com.brianonchari.datastructures.problems;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args){

        int[] nums1 = {1,2,3,4};
        System.out.println(ContainsDuplicate.containsDuplicateBruteForce(nums1));

        int[] nums2 = {1,2,3,1};
        System.out.println(ContainsDuplicate.containsDuplicateBruteForce(nums2));

    }

    // Approach 1: Use Bruteforce to each element at index i with all other elements
    public static boolean containsDuplicateBruteForce(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Approach 2: Using Hash Set
}
