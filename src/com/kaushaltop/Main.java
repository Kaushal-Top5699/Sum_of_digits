package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        int number = 0;

        while (number < 15) {

            number++;

            //The below condition skips the first five numbers
            if (number <= 5) {

                //System.out.println("Skipping number "+number);

                continue;
            }

            //This statement prints out remaining numbers
            System.out.println("Numbers "+number);

            //Below condition skips initial 10 numbers and prints numbers from 11 to 15
            if (number > 10) {

                // System.out.println("Breaking at "+number);

            }
        }

        System.out.println("Sum of digit in 125 is "+Digit.sumDigits(125));
        System.out.println("Sum of digit in -125 is "+Digit.sumDigits(-125));
        System.out.println("Sum of digit in 4 is "+Digit.sumDigits(4));
        System.out.println("Sum of digit in 32123 is "+Digit.sumDigits(32123));

        NumberPalindrome.isPalindrome(-1221);
        NumberPalindrome.isPalindrome(707);
        NumberPalindrome.isPalindrome(11212);

        FirstLastDigitSum.sumFirstAndLastDigit(252);
        FirstLastDigitSum.sumFirstAndLastDigit(257);
        FirstLastDigitSum.sumFirstAndLastDigit(0);
        FirstLastDigitSum.sumFirstAndLastDigit(5);
        FirstLastDigitSum.sumFirstAndLastDigit(-10);

    }
}
