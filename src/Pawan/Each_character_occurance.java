package Pawan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Each_character_occurance {

    //step 1 : convert each words into character
    //step2 : using loop compare each character
    //step 3 : if Character has same then increase count
    public static void main(String[] args) {
        String str ="Java automation";
        String[] result =str.split(" ");
        Map<Character,Integer>maplist =new HashMap<>();

        char[] c=str.toCharArray();
        for(char ch: c){
            if(maplist.containsKey(ch)){
                maplist.put(ch, maplist.get(ch)+1);
            }
            else {
                maplist.put(ch,1);
            }
        }
        System.out.println(maplist);

        Set<Character> resultant= maplist.keySet();

    }
}
