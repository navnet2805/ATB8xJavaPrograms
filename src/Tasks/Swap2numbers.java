package Tasks;

import java.util.Scanner;

public class Swap2numbers {
    public static void main(String[] args) {
        //swap 2 numbers without using 3rd variable/number.
        // a=2 b=3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of num2");
        int num2 = sc1.nextInt();

        System.out.println("Values of num1 and num2 before swapping is: " +"num1= " +num1 +" & " +"num2= " +num2);

        num2 = num1 + num2; //sum of 2 numbers
        num1 = num2 - num1; // b value stored in a.
        num2 = num2 - num1; // a value is stored in b
        System.out.println("Values of num1 and num2 after swapping is: " +"num1= " +num1 +" & " +"num2= " +num2);
    }
}
