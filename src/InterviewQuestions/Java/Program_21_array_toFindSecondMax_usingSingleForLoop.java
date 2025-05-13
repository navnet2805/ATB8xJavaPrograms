package InterviewQuestions.Java;

public class Program_21_array_toFindSecondMax_usingSingleForLoop {
    public static void main(String[] args) {
        int[] a = {10,3,9,1,55,4,8,74};

        int firstmax = a[0];
        int secondmax = 0;
        for (int num : a)
        {
            if (firstmax<num)
            {
                secondmax = firstmax;
                firstmax = num;
            }
        }
        System.out.println(secondmax);
    }
}
