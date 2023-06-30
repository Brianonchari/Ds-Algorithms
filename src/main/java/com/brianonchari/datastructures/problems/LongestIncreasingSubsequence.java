package com.brianonchari.datastructures.problems;

public class LongestIncreasingSubsequence {
    public static void main(String [] args){

    }

    public static int longestIncreasingSubsequence(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLength = 1;

        for(int i = 1;i<nums.length;i++){
            int maxSubsequenceLength = 0;
            for(int j = 0; j<1;j++){
                if(nums[i]> nums[j]){
                    maxSubsequenceLength = Math.max(maxSubsequenceLength, dp[j]);
                }
            }
            // Add 1 to the maximum subsequence length found so far
            dp[i] = maxSubsequenceLength + 1;

            // Update the maximum length if necessary
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;

    }
}
