/*
 * Author Name: Aditya Chaurasia
 * Date: 06-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class CollatzConjecture {
    /**
     * This method returns the number of steps required to reach 1 from the given number.
     *
     * @param number the number to count the steps for.
     * @return the number of steps required to reach 1 OR Integer.MIN_VALUE if the number is negative.
     */
    public int countStepsToReachOne(int number) {
        if (number > 0) {
            int steps = 0;
            while (number > 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                    steps += 1;
                } else {
                    number = (number * 3) + 1;
                    steps += 1;
                }
            }
            return steps;
        } else return Integer.MIN_VALUE;
    }
}