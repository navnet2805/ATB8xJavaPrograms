package InterviewQuestions.Java;
/*
Write a program to reverse only the smallest and Largest words in a given string.
String str = "Java is Beautiful programming"
output = "Java si Beautiful gnimmargorp"
 */

import java.util.Arrays;

public class Program_12_Cappgemini_String {

    public static void smallestlargestwordReverse(int[] a, String input)
    {
        Arrays.sort(a);
        int minvalue = a[0]; //2
        int maxvalue = a[a.length-1];
        StringBuilder sb = new StringBuilder();

        for (String s : input.split(" "))
        {
            if(s.length()==minvalue)
                sb.append(wordReverse(s)).append(" ");
            else if (s.length()==maxvalue)
                sb.append(wordReverse(s)).append(" ");
            else
                sb.append(s).append(" ");
        }
        System.out.println(sb);
    }

    public static StringBuilder wordReverse(String s)
    {
        StringBuilder temp = new StringBuilder(s);
        return temp.reverse();
    }

    public static void main(String[] args)
    {
        String input = "Java is Beautiful progamming";
        int[] arr = new int[input.split(" ").length];
        int a = 0;

        //store the number of words in the array form
        for (String s : input.split(" "))
        {
            arr[a++] = s.length();
        }

        smallestlargestwordReverse(arr,input);
    }
}
