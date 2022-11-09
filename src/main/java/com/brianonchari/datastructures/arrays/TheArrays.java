package com.brianonchari.datastructures.arrays;

import java.util.Arrays;

public class TheArrays {
  public static void main(String[] args) {
    String[] colors = new String[5];
    colors[0] = "Green";
    colors[1] = "Blue";
    colors[2] = "Purple";
    colors[3] = "Black";
    colors[4] = "Red";

    System.out.println(Arrays.toString(colors));

    // Access Arrays at given index
    System.out.println(colors[0]);
    System.out.println(colors[1]);
    System.out.println(colors[1]);
    System.out.println(colors[3]);
    System.out.println(colors[4]);

    // Re-assign value of an arrray index
    colors[2] = "Yellow";
    System.out.println(Arrays.toString(colors));

    int[] numbers = {100, 101, 102, 103};

    // Loop through an aray with for loop
    for (int number = 0; number < numbers.length; number++) {
      System.out.println(numbers[number]);
    }
    System.out.println("COLORS");
    for (int color = 0; color < colors.length; color++) {
      System.out.println(colors[color]);
    }

    // Reverse loop
    for (int color = colors.length - 1; color >= 0; color--) {
      System.out.println(colors[color]);
    }

    for (int number = numbers.length - 1; number >= 0; number--) {
      System.out.println(numbers[number]);
    }

    // Loop through an array with enhanced for loop
    for (String color : colors) {
      System.out.println(color);
    }

    // Loop through an array with streams
    Arrays.stream(colors).forEach(System.out::println);
  }
}
