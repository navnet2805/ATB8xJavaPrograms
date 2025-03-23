package Tasks.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practise1 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(12);
        marks.add(01);
        marks.add(50);
        marks.add(99);
        marks.add(0);
        System.out.println(marks); // print list
        Collections.sort(marks); // sorted
        System.out.println(marks); // print sorted list
        Collections.sort(marks,Collections.reverseOrder()); // reverse order
        System.out.println(marks); // print reverse order
        marks.add(1,02);
        System.out.println(marks);

    }
}
