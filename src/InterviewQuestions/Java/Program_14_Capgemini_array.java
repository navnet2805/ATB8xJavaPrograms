package InterviewQuestions.Java;
/*
Write a java program to move all zero at the end of array
{0,0,1,2,0,8,0,7,5,6,0,3}
 */

public class Program_14_Capgemini_array {

    public static void main(String[] args) {
        int[] a = {0,0,1,2,0,8,0,7,5,6,0,3};
        int[] res = new int[a.length];
        int i=0;

        for (int num : a)
        {
            if (num!=0)
                res[i++]=num;
        }

        for (int n : res)
        {
            System.out.print(n+" ");
        }
    }
}
