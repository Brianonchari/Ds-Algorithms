package com.brianonchari.datastructures.problems;

import java.util.Random;
/**
 * given a tray of 50 by 50 led bulbs.
 * A QA team needs a program that will help them determine the kind of  test to perform on an led bulb.
 * The probability of the bulb undergoing functional test is 17 % and the probability of the bulb undergoing structural test is 5%.
 * A bulb is selected at random from the tray.  If the bulb undergoes structural test. Print out row and colum of the bulb  and the type of test e.g R1C1:S.
 * If functional print out R2C2:F, eles print out R3C2: -
 * */

public class QALeds {

    public static void main(String[] args) {
        int numRows = 50;
        int numCols = 50;
        double functionalTestProbability = 0.17;
        double structuralTestProbability = 0.05;

        Random random = new Random();
        int selectedRow = random.nextInt(numRows) + 1; // Adding 1 to start from 1 instead of 0
        int selectedColumn = random.nextInt(numCols) + 1;

        double randomProbability = random.nextDouble();

        if (randomProbability <= structuralTestProbability) {
            System.out.println("R" + selectedRow + "C" + selectedColumn + ":S");
        } else if (randomProbability <= functionalTestProbability) {
            System.out.println("R" + selectedRow + "C" + selectedColumn + ":F");
        } else {
            System.out.println("R" + selectedRow + "C" + selectedColumn + ":-");
        }
    }
}
