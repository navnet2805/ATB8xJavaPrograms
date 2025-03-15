package Tasks.Collections;

import java.util.ArrayList;
import java.util.List;

public class Practise2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList();
        num.add(1);
       // num.add("adv"); // not possible becoz integer is specified explicitly

        List<String> name = new ArrayList();
        name.add("Naveen");
        name.add("Pawan");
        System.out.println(name);
        name.remove("Pawan");
        System.out.println(name);


    }
}
