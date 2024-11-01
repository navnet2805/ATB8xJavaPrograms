package Tasks;

import java.util.Scanner;

public class String_Even_Odd_Palindrome {

     static boolean compare(String str){
        // assign the string value from the method
        String str1 = str;

        // create a char of array to store the string value in array form
        char[] c = str1.toCharArray();

        // to find the length
        int sub_length = str1.length();

        // create a string to store the value
        char[] swap = new char[sub_length];

        for(char c1 : c){
            if (sub_length!=-1){
                swap[sub_length-1] = c1;
                sub_length--;
            }
        }
        String str2 = new String(swap);

        // compare both strings
         boolean value = str1.contains(str2);
         return value;
    }


    public static void main(String[] args) {
        //Input: str=”abzzab”
        //Output:YES
        //Explanation:
        //String formed by characters at odd indices: bzb, which is a Palindrome.
        //String formed by characters at even indices: aza, which is a Palindrome.
        //Hence, the given string is an Even-Odd Palindrome.
        //Input: str=”daccad”
        //Output: NO

        //input a string
        System.out.println("Enter the String name: ");
        Scanner sc = new Scanner(System.in);
        String Original_name = sc.next();
        System.out.println("Original String is: " +Original_name);


        //declare and intialise index value
        int index = 0;

        // find the length
        int length = Original_name.length(); //6

        //create a two substrings for even and odd
        String odd1 = "";
        String even1 = "";


        // code to create a string with odd and even indices. 0,1,2,3,4,5,6
            even1+=Original_name.charAt(0);
            odd1+=Original_name.charAt(1);

        for (index=2 ; index<length ; index++){
            if (index%2==0){
                //even
                even1+=Original_name.charAt(index);
            }
            else{
                //odd
                odd1+=Original_name.charAt(index);
            }
        }

        System.out.println("Odd sub string is: " +odd1);
        System.out.println("Even sub string is: " +even1);

        if (compare(odd1) && compare(even1))
            System.out.println(Original_name +" " +"is a odd-even palindrome");
        else
            System.out.println(Original_name +" " +"is not a odd-even palindrome");

    }
}
