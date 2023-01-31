package com.brianonchari.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapArrayList {
  public static void main(String[] args) {

    //        ArrayList<String> myList = new ArrayList<>();
    //        myList.add("A");
    //        myList.add("B");
    //        myList.add("C"); //2
    //        myList.add("D");
    //        myList.add("E");
    //        myList.add("F"); //5
    //
    //        for (int i = 0; i <= myList.size(); i++) {
    //
    //        }
    //
    //        System.out.printf("\nOriginal List \n" + myList);
    //        Collections.swap(myList, 2, 5);
    //        System.out.printf("\n After Swap \n" + myList);

    // Create a list of words
    List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "orange", "banana");

    // Create a new list that includes only the unique words in the original list
    List<String> uniqueWords = new ArrayList<>();
    for (String word : words) {
      if (!uniqueWords.contains(word)) {
        uniqueWords.add(word);
      }
    }

    // Iterate over the unique list of words and for each word, find all occurrences in the original
    // list and swap them
    for (String word : uniqueWords) {
      int index = words.indexOf(word);
      while (index != -1) {
        // Check if the current word is followed by another occurrence of the same word
        if (index + 1 < words.size() && words.get(index + 1).equals(word)) {
          // Swap the current word with the next occurrence
          String temp = words.get(index);
          words.set(index, words.get(index + 1));
          words.set(index + 1, temp);
        }

        // Move to the next occurrence of the word
        //                index = words.indexOf(word, index + 1);

      }
    }

    // Print the modified list
    System.out.println(words); // Output: [banana, apple, orange, banana, apple, orange]
  }
}
