package InterviewQuestions.Java;

/*
find the given string is palindrome without using Array or Loop
input: OUTPUT
output: Not Palindrome
Input: ABCDCBA
output: Palindrome
 */
public class Program_02 {
    public static void main(String[] args) {
        String input = "OUTPUT";
        StringBuilder rev = new StringBuilder(input).reverse();

        if (input.contains(rev))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}
