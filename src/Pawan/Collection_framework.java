package Pawan;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection_framework {
    public static void main(String[] args) {

        List mylist = new ArrayList();{
            mylist.add("AAA");
            mylist.add("BBB");
            System.out.println(mylist);
            System.out.println(mylist.get(1));
            System.out.println(mylist.contains("BBB"));
            System.out.println(mylist.getFirst());
            System.out.println(mylist.add(384385));
            System.out.println(mylist);
       }
    }
}

