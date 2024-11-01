package Tasks;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse the String without using the any functions. (for loop)

        // Enter a string from user input
        System.out.println("Enter the string name: ");
        Scanner sc = new Scanner(System.in);
        String Original_name = sc.next();
        System.out.println("Original string name: " +Original_name);

        // find length of the string
        int length = Original_name.length();

        //converting string to array of list
        char[] c = Original_name.toCharArray();
        char[] SwapChar = new char[length];


        //reverse using for loop
        for(char c1 : c){     //naveen
            if (length!=-1) {
                SwapChar[length-1] = c1;
                length--;
            }
        }

        String Swapped_String = new String(SwapChar);
        System.out.println("Swapped String name: " +Swapped_String);

       }
}
