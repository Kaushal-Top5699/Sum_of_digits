package com.kaushaltop;

import org.w3c.dom.ls.LSOutput;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        //If number is single digit number, then add the number to itself
        if (number >= 0 && number <= 9) {

            System.out.println(number+number);

            return number+number;

            //If number is not single digit number, then get last digit and first digit
        } else if (number > 9) {

            int lastDigit = number%10;

            //first set the firstDigit = number
            int firstDigit = number;

            //set the condition >= 10
            while (firstDigit >= 10) {

                //keep dividing by 10
                firstDigit /= 10;

            }
            //loop breaks here, first digit is here
            //add up the two digits
            System.out.println(firstDigit+lastDigit);

            return firstDigit+lastDigit;
        }

        System.out.println("Invalid");
        return -1;
    }
}
