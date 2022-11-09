package com.brianonchari.datastructures.arrays;

import com.brianonchari.datastructures.recursion.Recursion;

import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                board[i][j] ='-';
            }
        }
        board[0][0]='0';
        board[1][0]='0';
        board[2][0]='0';
//        board[0][0]='0';
        System.out.println(Arrays.deepToString(board));

        //Inline creation of 2D-Array
        char[][] newBoard = new char[][]{
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
        };

        System.out.println(Arrays.deepToString(newBoard));

        Recursion.firstMethod();

    }
}


// language..Java
// design patterns
// algorithms
// data structures
// solid principles
// practise 
