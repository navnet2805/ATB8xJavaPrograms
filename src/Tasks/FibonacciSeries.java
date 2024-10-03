package Tasks;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci series is a series of numbers where after the initial two numbers, every occurring number is the sum of two preceding numbers.
        //For Example 0,1,1,2,3,5,8,13,21………
        int n1=0 , n2=1 , sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of series need to be printed: ");
        int number = sc.nextInt();
        System.out.print("Fibonacci series of 1st " +number +"'s are: " +n1 +" , " +n2);

        for (int iteration=2 ; iteration<number ; iteration++){
            sum = n1+n2;
            System.out.print(" , " +sum);
            n1=n2;
            n2=sum;

        }
    }
}

