package InterviewQuestions.Java;

public class Program_06_ArrayMid {
    /*
    given array = {1,1,7,2,0};
                   {1,1,8,0,2,0}
    output should be 7 because sum of all left from 7 is same as sum of all elements to right
     */
    public static void main(String[] args) {

        int[] input = {1,1,7,2,0};
        int total_sum = 0;
        int left_sum = 0;

        for (int n : input)
        {
            total_sum = total_sum + n;
        }
        System.out.println(total_sum);

        for (int i=0 ;i<input.length ; i++)
        {
            total_sum = total_sum - input[i];

            if (total_sum == left_sum)
            {
                System.out.println("element is : " +input[i]);
            }
            left_sum = left_sum +input[i];
        }
    }
}
