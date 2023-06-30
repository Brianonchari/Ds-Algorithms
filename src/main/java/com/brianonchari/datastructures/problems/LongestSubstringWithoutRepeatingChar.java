package com.brianonchari.datastructures.problems;
/*
 *
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String [] args){

        String s1 = "abcabcab";
        String s2 = "aaaaaaaa";
        String s3 = "brianonchari";

        System.out.println("Longest substring of s1 is : " + lengthOfLongestSubstring(s1));
        System.out.println("Longest substring of s2 is : " + lengthOfLongestSubstring(s2));
        System.out.println("Longest substring of s3 is : " + lengthOfLongestSubstring(s3));

    }

    public static int lengthOfLongestSubstring(String s){
        int maxLength = 0;
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();

        while(right<s.length()){
            char currentChar = s.charAt(right);
            if(!seen.contains(currentChar)){
                seen.add(currentChar);
                maxLength = Math.max(maxLength,(right - left) + 1);
                right++;
            } else  {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
