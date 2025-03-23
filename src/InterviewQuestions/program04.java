package InterviewQuestions;

import java.util.Arrays;

//Write a program to find the first non-repeating character in a string without using Collections.
public class program04 {

    public static void method(String input)
    {
        int lower = 0;
        int upper = 0;
       String[] s =  input.split(" ");

       for (String word : s)
       {
           char[] c = word.toCharArray();
           for (int i=0 ; i<c.length ; i++)
           {
               if (c[i]>='a' && c[i]<='z')
                   lower++;
               else if (c[i]>='A' && c[i]<='Z') {
                   upper++;
               }
           }
       }

        System.out.println("total count of Upper case letters: " +upper);
        System.out.println("total count of Lower case letters: " +lower);



    }

    public static void main(String[] args)
    {
        String s = "WelcomE to AutomAtioN";
        method(s);

    }
}
