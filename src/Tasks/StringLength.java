package Tasks;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        //Calculate the length of the String - without using the length() function.
        // String name =”Pramod”; →  6 , CharArray, for loop


        System.out.println("Enter the string name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[] c = name.toCharArray();
        int length=0;
        for (char c1 : c){
            length++;
        }
        System.out.println(length);

    }
}
