package Pawan;

import java.util.HashMap;

import java.util.Set;

public class Programs{

    public static void main(String[] args)
    {

//        // Input: Java is good programming langauges
//        // Output: avaJ si doog gnimmargorp seguagnal
//
//        String str="Java is good programming langauges";
//        String [] word=str.split(" ");
//
//        StringBuffer result= new StringBuffer();
//
//        for(String words : word){
//            StringBuilder stringBuilder=new StringBuilder(words);
//            result.append(stringBuilder.reverse().toString()).append(" ");
//        }
//        System.out.println(result.toString());

        String str="Learn Java Programming";
 /*
a : 4
g : 2
m : 2
n : 2
r : 3
*/
        HashMap<Character,Integer> map= new HashMap<>();
        char[] strarray=str.toCharArray();
        for(char c : strarray)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        Set<Character> set=map.keySet();
       for(char dup : set){
           if(map.get(dup)>1){
               System.out.println(dup + ":" + map.get(dup));
           }
    }
    }
}
