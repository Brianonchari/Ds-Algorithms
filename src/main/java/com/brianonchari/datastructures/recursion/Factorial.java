package com.brianonchari.datastructures.recursion;

/**
 * ============================ STEPS TO WRITING A RECURSION FUNCTION 1. Identify the recursive case
 * - the flow 2. Create a base case - the criterion 3. Unintentional case - the constraint i.e Make
 * sure the function stops for every possible argument of n
 */
public class Factorial {
  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    var rec = factorial.factorial(5);
    System.out.println(rec);
  }

  public int factorial(int n) {
    if (n < 1) {
      return -1;
    }

    if (n == 1 || n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
