package com.teachmeskills.hw17.task1.solution;

import com.teachmeskills.hw17.task1.myfunc.MyFunc;

import java.util.Scanner;

/**
 * Class for implementation of string reverse and calculation of the factorial of a number
 * this class contains private constructor which does not allow creating objects of this class.
 */
public class Solution {
    private Solution() {

    }

    public static void doReverseOfAStringAndFactorialOfANumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 if you want to reverse a string or Enter 2 if you want to calculate the factor of a number: ");
        if (scanner.hasNextInt()) {
            while (true) {
                int number = scanner.nextInt();
                if (number == 1) {
                    MyFunc<String> my1;
                    my1 = (str) -> {
                        String result = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            result += str.charAt(i);
                        }
                        return result;
                    };
                    System.out.println(my1.doSomething("Vladislav"));
                    return;
                } else if (number == 2) {
                    MyFunc<Integer> my2;
                    my2 = (num) -> {
                        int result = 1;
                        for (int i = 1; i <= num; i++) {
                            result = result * i;
                        }
                        return result;
                    };
                    System.out.println(my2.doSomething(10));
                    return;
                } else {
                    System.out.println("re-Enter. Enter 1 or 2");
                }
            }
        } else {
            System.out.println("re-Enter. Enter an integer");
        }
        scanner.close();
    }

}
