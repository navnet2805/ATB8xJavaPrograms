package Pawan;

import java.util.Scanner;

public class Find_NumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
       int num= sc.nextInt();//1234

       int count=0;
       int temp=0;

       while (num>0){
           temp=num %10;//1234  -> 4
           count++;
           num=num/10;
       }
        System.out.println("the number of digits is : " + count);

    }
}
