package InterviewQuestions.Java;
//Write a program to find the first non-repeating character in a string without using Collections.

public class Program_20_String {

    public static char firstNonRepeatingCharacter(String s)
    {
        int[] freq = new int[256]; //ASCII

        for (int i=0 ; i<s.length() ; i++)
        {
            freq[s.charAt(i)]++;
        }

        for (int i=0 ; i<s.length() ; i++)
        {
            if(freq[s.charAt(i)] ==1)
            {
                return s.charAt(i);
            }
        }

        return 0; //if no element is found
    }


    public static void main(String[] args) {
        String s = "abbccddeff";
        char result = firstNonRepeatingCharacter(s);

        if (result!=0)
            System.out.println(result);
        else
            System.out.println("All the characters are repeating");
    }
}
