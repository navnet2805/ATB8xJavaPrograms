package Pawan;
//condition1 : Get the number by user example: 12345
//condition 2 : get each number and perform addition to the nth number
//condition 3: take the sum of all digits.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sumOfDigits = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " +
                sumOfDigits);
    }
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to sum
            number = number / 10; // Remove the last digit from number
        }
        return sum;
    }


    }


