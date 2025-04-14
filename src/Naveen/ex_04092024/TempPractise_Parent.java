package Naveen.ex_04092024;

import java.util.Arrays;

public class  TempPractise_Parent
{
//Check if Two Strings Are Anagrams
    /*
    Anagram - > length should be same
    --> each char present in s1 should be same in s2
     */
    public static void main(String[] args)
    {
        String s1 = "listen";
        String s2 = "silent";

        //length should be same
        if (s1.length()==s2.length())
        {
            if(Arrays.equals(s1.toCharArray(),s2.toCharArray()))
            {
                System.out.println("Given strings are anagrams");
            }
            else
            {
                System.out.println("Given strings are not anagram");
            }

        }
        else
        {
            System.out.println("Given strings are not anagram");
        }

    }

}


