package com.brianonchari.datastructures.problems;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 *
 */

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c == '['){
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else if (c==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String [] args){
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "{[}]";
        String s4 = "([)]";

        System.out.println(s1 + " is valid: " + isValid(s1)); // true
        System.out.println(s2 + " is valid: " + isValid(s2)); // true
        System.out.println(s3 + " is valid: " + isValid(s3)); // false
        System.out.println(s4 + " is valid: " + isValid(s4)); // false
    }
}
