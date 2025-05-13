package Pawan;

import java.util.Scanner;

//The number should be same as reverse also
// Condition 1 get the num and reverse and store in new variable
// condition 2 check the original number into reversed number
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers : ");
        int number=sc.nextInt();

        int rev_num=number;
        int palin_num=0;

        // Condition 1 get the num and reverse and store in new variable

        while (rev_num>0){
            palin_num=palin_num *10+rev_num%10;
            rev_num=rev_num/10;
        }
        System.out.println("The number after reversing from original Number is : " + palin_num);

        if(palin_num==number)
            System.out.println("hence its a palindrome number");
        else
            System.out.println("hence its not a palindrome number");

    }

}
