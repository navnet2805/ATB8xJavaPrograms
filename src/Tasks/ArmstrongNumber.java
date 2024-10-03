package Tasks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        If you have a third-digit number lets say
//        153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
//        If you have a four-digit number lets say
//        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

        //initialization
        int digits = 0, temp = 1, Each_digit=0, result=0;

        //write a number to check armstrong or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check is it Armstrong number or not: ");
        int actual_number = sc.nextInt();

        // Logic to find the number of digits
        int number = actual_number;
        while (digits >= 0) {
            if (temp != 0) {
                temp = number / 10;
                digits++;
                number = temp;
            }
            else
            {
                System.out.println("number of digits in a number: "+digits);
                break;
            }
        }

        // logic to find each digits and apply armstrong method.
        int num2 = actual_number;
        while(num2>0){
            Each_digit = num2%10 ;
            result += Math.pow(Each_digit, digits);
            num2=num2/10;
        }
        System.out.println("result of a given number: "+result);

        // to check result with the actual number
        if (actual_number == result)
            System.out.println("The " +actual_number +" number " +"is armstrong");
        else
            System.out.println("The " +actual_number +" number " +"is not armstrong");
    } // Ending of main loop
}// ending of java program


