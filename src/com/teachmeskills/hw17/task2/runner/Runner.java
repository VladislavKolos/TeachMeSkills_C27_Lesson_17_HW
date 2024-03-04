package com.teachmeskills.hw17.task2.runner;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class with method main to run the program
 * class to get the day of the week from a date.
 */
public class Runner {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 4);

        System.out.println(calendar.getTime());
    }
}
