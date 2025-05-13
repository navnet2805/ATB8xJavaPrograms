package Pawan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Odd_Even {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers : ");
        int num   = sc.nextInt();

        if(num %2==0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd");
        }

    }


}
