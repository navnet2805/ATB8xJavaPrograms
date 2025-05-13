package Pawan;

import java.util.Scanner;

//Step1: if i is divisible by 3 its called as Fizz
//step2 : If i is divisible by 5 its called as Buzz
//Step3 : If it is divisible by both 3 and 5 then its called as FizzBUzz
public class Fizz_Buzz {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number : " );
                int num=sc.nextInt();
        int Frist_num=num;
        for(int i=1;i<=Frist_num;i++){
             if ( i%3==0 && i%5==0) {
                System.out.println("This Number is Fizz buzz : " + i );

            }
            else if(i%3==0){
                System.out.println("This Number is fizz : " + i);
            }
            else if (i%5==0) {
                System.out.println("This Number is BUzz : " + i);

            }
            else{
                System.out.println( "This number is a String : " + i );
            }
        }

    }
}
