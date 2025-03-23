package Tasks;

import java.util.Scanner;

public class PrimeNumberForSpecificNumber {
    public static void main(String[] args) {
// prime number has 2 conditions
        // 1. greater than 1
        // 2. it should be divisible by 1 and itself {it should have only 2 factors}


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : "); // number to be checked prime or not.
        int number = sc.nextInt();

        int number_of_factors = 0;

        // logic for 1st condition
        if (number>1){
            for (int i=1 ; i<=number ; i++){
                //logic for 2nd condition
                if (number%i==0){
                    number_of_factors++;
                }
            }
            if (number_of_factors==2){
                System.out.println(+number +" is a prime");
            }
            else{
                System.out.println(+number +" is not a prime");
            }
        }
        else{
            System.out.println(+number +" is not a prime");
        }

    }
}

