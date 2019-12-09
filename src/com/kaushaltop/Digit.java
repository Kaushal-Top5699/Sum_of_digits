package com.kaushaltop;

public class Digit {

    public static int sumDigits(int number) {

        int sum = 0;

        if (number < 10) {

            return -1;
        }
        while (number > 0) {

            //extract the least significant digit
            int digit = number%10;

            sum += digit;

            //drop the least significant digit
            number /= 10;

        }
        return sum;
    }
}
