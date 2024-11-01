package Tasks;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        //check whether string is a palindrome or not.
        // abba == abba is a palindrome.

        // input a string
        System.out.println("Give any string: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("Value of Original string is: " +str1);

        // length of the string
        int length = str1.length();

        // convert the original string to char of array.
        char[] c = str1.toCharArray();

        // create a new array list to store the swapped values.
        char[] swap = new char[length];

        for(char c1 : c){
            if (length!=-1) {
                swap[length - 1] = c1;
                length--;
            }
        }
        String str2 = new String(swap);
        System.out.println("Swapped values of Original string is: " +str2);

        //to check str1 and str2 are palindrome or not.
        boolean value = str1.contains(str2);
        if (value)
            System.out.println("given string is a palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
