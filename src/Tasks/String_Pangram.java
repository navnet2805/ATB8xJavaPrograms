package Tasks;

import java.util.Scanner;

public class String_Pangram {

    public static boolean PangramCheck(String s){
        String Sentence=s.toLowerCase();

        for (char c ='a' ; c <= 'z' ; c++) {
            if (Sentence.indexOf(c) == -1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // A pangram is a sentence containing every letter in the English Alphabet.
        //Input: “The quick brown fox jumps over the lazy dog”
        //Output: is a Pangram
        //Explanation: Contains all the characters from ‘a’ to ‘z’]
        //
        //
        //Input: “The quick brown fox jumps over the dog”
        //Output: is not a Pangram
        //Explanation: Doesn’t contain all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing

        // to have user input
        System.out.println("Enter any sentence: ");
        Scanner sc = new Scanner(System.in);
        String Sentence = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("The sentence is: " +Sentence);

        // call method to check pangram or not
        if (PangramCheck(Sentence))
            System.out.println("is a pangram");
        else
            System.out.println("is not a pangram");


    }
}
