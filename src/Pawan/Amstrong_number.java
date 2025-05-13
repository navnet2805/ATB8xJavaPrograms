package Pawan;

import java.util.Scanner;

//Step1 : get the number from user
//Step 2: count the number of digits ex:153 , count =3
// step 3: each Digit should be power of counted digits  ex: 1^3 + 5^3 + 3^3 =153
// step 4 : the sum of digits should be same as number from user. num=153 and o/p = 153


public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
       int  num=sc.nextInt();
       int count =0;
       int temp=0;
       int sum=0;
       while(num>0){

           temp=temp+num%10;//153  -> 3
           count++;
           num=num/10;//153 --> 15
       }

        //System.out.println(count);


    }



}
