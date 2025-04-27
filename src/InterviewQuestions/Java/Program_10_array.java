package InterviewQuestions.Java;

public class Program_10_array {
    //Second-highest element in an unsorted array without using the sort function.

    public static void main(String[] args) {

        int[] ar = {10,22,3,90,5,42,11,6}; //unsorted array.

        for (int i=0 ; i<=1 ; i++)
        {
            int maxindex = i;
            for (int j=i+1 ; j<ar.length ; j++)
            {
                if (ar[maxindex] < ar[j])
                {
                    maxindex=j;
                }
            }
            //swap code
            int temp = ar[i];
            ar[i] = ar[maxindex];
            ar[maxindex] = temp;
        }

        System.out.println(ar[1]);


    }
}
