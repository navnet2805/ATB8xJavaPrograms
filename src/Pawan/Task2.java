package Pawan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {

    /*
    Java program to count Occurrences of Each Character in String

     */

    public static String occurance(String input){
        HashMap<String,Integer> map=new HashMap<>();
        int count=0;

        for(String words :input.split(" ")){
            if(!map.containsKey(words)) {
                map.put(words, 1);
                count++;
            }
            else{
                count++;
            }
        }

        System.out.println(count);
        return input;

    }
    public static void main(String[] args) {
        String str="Test Automation for Java Automation";
        occurance(str);
    }
}
