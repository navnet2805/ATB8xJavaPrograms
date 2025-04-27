package InterviewQuestions.Java;

import java.util.*;

/*
Write a java code to filter out dupicate intergers.
 int [] a ={1,2,2,3,3,34,6,7,8}
 */
public class Program_19_array {
    public static void main(String[] args) {
        int[] a ={1,2,2,3,3,34,6,7,8};
        Set<Integer> set = new HashSet();

        for (int n : a)
        {
            set.add(n);
        }
        System.out.println(set);
    }
}
