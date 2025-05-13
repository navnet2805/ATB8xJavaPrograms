package Pawan;

import java.util.Scanner;

public class PrimeNumbers {
    //num1 = 5
    //num2 = 10
    //num1=num1+num2 // 15
    //num2=num1-num2// 5
    //num1=num1-num2// 10


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the second number : ");
        int num2 = sc1.nextInt();

        int res = (num1>num2)? num1 : num2 ;
        System.out.println(res);



    }
}
