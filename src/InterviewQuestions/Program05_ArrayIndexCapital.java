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
        int[] ar = {0,5,12};
        StringBuilder sb = new StringBuilder();

        char[] c = input.toCharArray();

        for (int index : ar)
        {
            if (index>=0 && index<c.length)
            {
                c[index] = Character.toUpperCase(c[index]);
            }
        }

        System.out.println(new String(c));
    }

}
