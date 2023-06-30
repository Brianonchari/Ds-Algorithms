package com.brianonchari.datastructures.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Statement
 * =================
 * Given a string sentence containing English letters (lower- or upper-case), return true if sentence is a Pangram, or false otherwise.
 *
 * A Pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Example 1:
 * ================
 * Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
 * Output: true
 * Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.
 *
 * Example 2:
 * Input: sentence = "This is not a pangram"
 * Output: false
 * Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.
 */



public class Pangram {
    public static void main(String[] args){
        String  sentence = "TheQuickBrownFoxJumpsOverTheLazyDog";
        String  sentence2 = "This is a program";
        Pangram.checkIfPangram(sentence2);

    }

    /*
    * Time Complexity
    * ----------------
    * The Time complexit of this solution is O(n), where n is the length of the input string 'sentence'
    *
    * Space Complexity
    * ----------------
    * The space complexity is O(1), since the English alphabets have a constant size of 26
    * */

    public static boolean checkIfPangram(String sentence) {
        Set<Character> str = new HashSet<>();
        for(char x:sentence.toLowerCase().toCharArray()){
           if(Character.isLetter(x)){
               str.add(x);
           }
        }
        System.out.println(str.size()==26);
        return str.size()==26;
    }
}
