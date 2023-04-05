package com.brianonchari.datastructures.problems;

import java.util.Arrays;

/** Given two strings, write a program to check if the strings are an anagram of each other */
public class Anagram {
  private static int CHARACTER_RANGE = 256;
  // Method 1
  // Sort Both Strings
  // Compare both strings
  static boolean isAnagramSorting(char[] str1, char[] str2) {

    // Get the size of the string
    int n1 = str1.length;
    int n2 = str2.length;

    // if length of both strings are not the same, they cannot be anagram
    if (n1 != n2) return false;

    // Sort both strings and compare the sorted Strings
    Arrays.sort(str1);
    Arrays.sort(str2);

    for (int i = 0; i < n1; i++) if (str1[i] != str2[i]) return false;
    return true;
  }

  // Method2
  // count the number of occurences of each character in our inputs
  // if these histograms are equal between the inputs, then the strings are
  // anagrams
  static boolean isAnagramCounting(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    int count[] = new int[CHARACTER_RANGE];
    for (int i = 0; i < str1.length(); i++) {
      count[str1.charAt(i)]++;
      count[str2.charAt(i)]--;
    }
    for (int i = 0; i < CHARACTER_RANGE; i++) {
      if (count[i] != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    char str1[] = {'s', 'i', 'l', 'e', 'n', 't'};
    char str2[] = {'l', 'i', 's', 't', 'e', 'n'};

    // Function Call
    if (isAnagramSorting(str1, str2))
      System.out.println("The two strings are" + " anagram of each other");
    else System.out.println("The two strings are not" + " anagram of each other");
  }
}
