package com.brianonchari.datastructures.playground;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class JavaDates {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDateOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDateOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

        if (currentDate.equals(firstDateOfMonth)) {
            System.out.println("The current date is the first date of the month.");
            System.out.println("The last date of the month is: " + lastDateOfMonth);
        } else {
            LocalDate firstDateOfNextMonth = currentDate.with(TemporalAdjusters.firstDayOfNextMonth());
            System.out.println("The current date is not the first date of the month.");
            System.out.println("The first date of the next month is: " + firstDateOfNextMonth);
            System.out.println("The last date of the next month is: " + firstDateOfNextMonth.with(TemporalAdjusters.lastDayOfMonth()));
            System.out.println("Last date of the  3rd month : " + firstDateOfNextMonth.plusMonths(3).with(TemporalAdjusters.firstDayOfMonth()).minusDays(1));
//            LocalDate lastDateOfMonth = firstDateOfNextMonth.minusDays(1);
        }
    }
//    public static void main(String [] args){
//
////        LocalDate currentDate = LocalDate.now();
////
////        // Calculate the first day of the next month
////        LocalDate firstDayOfNextMonth = currentDate.with(TemporalAdjusters.firstDayOfNextMonth());
////
////        System.out.println("First day of the next month: " + firstDayOfNextMonth);
//    }
}


