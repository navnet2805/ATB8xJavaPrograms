package InterviewQuestions;

public class Program05_ArrayIndexCapital {
    /*
    Write a java program with the below inputs, where arrays inputs are considered as index of the string.
String = "java programming language"
int[] arr = {0,5, 17} // 0th,5th,17th index should be captial letter

and output should be in the form of below:
Output = Java Programming Language
     */

    public static void main(String[] args) {
        String input = "java programming language";
        int[] ar = {0,5,11};
        StringBuilder sb = new StringBuilder();

        for (int i=0 ; i<input.length() ; i++)
        {
            if (i==ar[0] || i==ar[1] || i==ar[2])
            {
                String s = String.valueOf(input.charAt(i)).toUpperCase();
                sb.append(s);
            }
            else
            {
                char c = input.charAt(i);
                sb.append(c);
            }
        }
        System.out.println(sb);

    }

}
