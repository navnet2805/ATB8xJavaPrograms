package InterviewQuestions.Java;

/*
Write a program to generate below patterns:
1
12
123
1234
12345

Note: No array/Collection should be used.
 */



public class Program_01 {
    public static void main(String[] args) {
        String num = "1";
        int count = 2;

        System.out.println(num);
        for (int i=2 ; i<=5 ; i++)
        {
            num = num+count++;
            System.out.println(num);
        }
    }
}
