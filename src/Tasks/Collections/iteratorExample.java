package Tasks.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorExample {
    public static void main(String[] args) {
        List<String> name = new ArrayList();
        name.add("Naveen");
        name.add("Pawan");
        name.add("Nethra");
        name.add("Kalavthi");

        System.out.println("can be iterated using 3 methods");

        //1st method
        System.out.println("-------for loop---------");
        for (int i=0 ; i<name.size();i++){
            System.out.println(name.get(i));
        }

        //2nd method
        System.out.println("-------for each loop---------");
        for (String str : name){
            System.out.println(str);
        }

        //3rd method
        System.out.println("-------Iterator method---------");
        Iterator<String> obj = name.iterator();
        while (obj.hasNext()){
            System.out.println(obj.next());
        }



    }
}
