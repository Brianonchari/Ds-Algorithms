package com.brianonchari.datastructures.problems;

/*
 *
 * This dance asks every performer to follow a precise sequence of steps:
 *
 * • Stage 0 : First, get away from obstacles by setting up your starting point at position 0
 *
 * • Stage 1 : Take one step forward (+1 step)
 *
 * • Stage 2 : Take two steps backward (-2 steps)
 *
 * • To follow, the steps as well as the direction you will have to take in your next move will each time be obtained thanks to a specific calculation: the number of steps you took on the previous stage minus the number of steps you took on the penultimate stage.
 *
 * That is, on stage 3, a dancer will have to take 3 steps backwards (-2 - 1).
 *
 * At stage 3, the dancer is at position -4.
 * */
public class DancingGame {

    public static void main(String [] args){
        int n = 3;
        int position = getPositionAt(n);
        System.out.println(position);
    }

    public static int getPositionAt(int n) {
        if (n == 0) {
            return 0;
        }

        int prevPrevStep = 0;
        int prevStep = 1;
        int position = 0;

        for(int i = 2; i<=n ; i++){
            int steps = prevStep - prevPrevStep;
            position -= steps;

            prevPrevStep = prevStep;
            prevStep = steps;
        }

        return position;
    }
}
