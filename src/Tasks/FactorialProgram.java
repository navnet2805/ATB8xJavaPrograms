package Tasks;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        // Fact of 1 = 1*1 = 1
        // Fact of 2 = 2*1 = 2
        // Fact of 3 = 3*2*1 = 6
        // Fact of 5 = 5*4*3*2*1 = 120
        //                   *num2*num1
        //             num* (num-1)* (num-2)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, to calculate the factorial: ");
        int num = sc.nextInt();
        int result = 2; // last 2 number are 2 and 1 for all factorial, 2*1=2 is common for all

        if (num == 1 || num == 0) {
            System.out.println("Factorial of " +num  +" is : 1");
        }

        else if (num == 2) {
            System.out.println("Factorial of " +num  +" is : 2");
        }

        //Logic
        else if (num >= 3) {
            for (int i = 3; i <= num; i++) {
                result = result * i ;
         }
            System.out.println("Factorial number of " +num +" is : " +result);
        }

    }
}
