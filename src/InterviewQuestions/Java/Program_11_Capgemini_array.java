package InterviewQuestions.Java;
/*
Write a program to find a leader elements(descending order) in an given array?
input = {8,5,1,9,3}    output = {9,8,5,3,1}
 */

public class Program_11_Capgemini_array {

    public static void main(String[] args) {
        int[] a = {8, 5, 1, 9, 3}; //9 8 5 1 3

        for (int i=0 ; i<a.length ; i++)
        {
            int maxindex = i; //1
            for (int j=i+1 ; j<a.length ; j++)
            {
                if (a[maxindex] < a[j]) //values
                {
                    maxindex = j;
                }
            }
            //swap code
            int temp = a[i];
            a[i] = a[maxindex]; //logic
            a[maxindex] = temp;
        }

        for (int num : a)
        {
            System.out.print(num+" ");
        }
    }
}
