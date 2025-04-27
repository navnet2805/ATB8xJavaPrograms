package InterviewQuestions.Java;
/*
Write a program to count the occurence of each character in a string
input="java program"
 */

import java.util.HashMap;
import java.util.Map;

public class Program_13_Capgemini_Map {

    public static void main(String[] args) {
        String input = "java program";
        String input1 = input.replace(" ","");
        Map<Character, Integer> map = new HashMap();

        for (char c : input1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" --> " +entry.getValue());
        }
    }
}
