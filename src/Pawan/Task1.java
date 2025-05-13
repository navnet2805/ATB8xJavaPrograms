package Pawan;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {
    /*
   Java program to find duplicate characters in a string
   logic
    Step 1 : convert String into char and store
    Step 2 : and using Hash map will get duplicate character by using containsKey() method
    Step 3 : We will use Set Interface
    Step 4 : By using Set(I) we will display the duplicate character.

     */

    public static void duplicates(String input){

        if(input==null){
            System.out.println("its an empty null");
        }
        if (input.isEmpty()){
            System.out.println("its an empty string");
        }
        if(input.length()==1){
            System.out.println("having single character in a string");
        }

        // Actually logic starts for duplicate
       // String[] space=input.split(" ");
        char [] words=input.toCharArray();

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for(Character ch: words){

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<Character,Integer>> entrySet= new HashSet<>(map.entrySet());

        for(Map.Entry<Character, Integer> c:entrySet){

            if(c.getValue()==1){
                System.out.print("( " +c.getKey() + " : " + c.getValue() + ")" +" ");
            }
            if(c.getValue()>1){
                System.out.print("( " +c.getKey() + " : " + c.getValue() + ")" +" ");
            }
        }

    }
    public static void main(String[] args) {

        String str="Learn Java Programming";

        System.out.println(str);
        duplicates(str);

    }
}
