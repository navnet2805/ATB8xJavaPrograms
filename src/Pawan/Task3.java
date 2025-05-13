package Pawan;

import java.util.Arrays;

public class Task3 {
    /*
    Java program to determine if Two Strings are Anagrams
String str1 = "listen";
String str2 = "silent";
    logic :
    step 1: check the length of each string ,if same the go into the loop
    step2: check the same character in each string . if same then its a anagram

     */
    public static boolean Anagram(String str1,String str2) {

        //whitespace remove
        String s1=str1.replaceAll("\\s","");
        String s2=str2.replaceAll("\\s","");

        if(s1.length() != s2.length()){
            return false;
       }
        else {
            char[] c1=s1.toLowerCase().toCharArray();
            char[] c2=s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

           return Arrays.equals(c1,c2);
        }
    }

    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "ACt";

        System.out.println(Anagram(str1, str2));
    }
}
