package Tasks.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("Apple");
        s1.add("banana");
        s1.add("grapes");
        System.out.println(s1);  // order is not maintained


        Set s2 = new LinkedHashSet();
        s2.add("Apple");
        s2.add("banana");
        s2.add("grapes");
        System.out.println(s2);  // order is maintained


    }
}
