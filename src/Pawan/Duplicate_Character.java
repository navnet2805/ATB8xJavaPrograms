package Pawan;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Duplicate_Character {

    /*
      Java program to find duplicate characters in a string
      Step 1: Read the string
      Step 2 : find the same character in a String and count the duplicate and store
     */

    public static void main(String[] args) {

        String s = "Pawan";

        HashMap<Character, Integer> map1 = new HashMap<>();

        char[] array=s.toCharArray();
//        int count=1;

        for(char c: array){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        System.out.println("the duplicate characters are : ");
//        int value = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
           // if (value > 1) {
                System.out.println(key + " : " + value);
           // }
        }
    }
}







