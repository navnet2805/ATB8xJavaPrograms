package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

/*
find the given string is palindrome without using Array or Loop
input: OUTPUT
output: Not Palindrome
Input: ABCDCBA
output: Palindrome
 */
public class Program02 {
    public static void main(String[] args) {
        String input = "OUTPUT";
        StringBuilder rev = new StringBuilder(input).reverse();

        if (input.contains(rev))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}
