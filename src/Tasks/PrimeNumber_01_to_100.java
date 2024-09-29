package Tasks;

public class PrimeNumber_01_to_100 {
    public static void main(String[] args) {
        // prime number has 2 conditions
        // 1. greater than 1
        // 2. it should be divisible by 1 and itself {it should have only 2 factors}

        //write a program to find prime number from 1 to 100
          for (int number= 2 ; number<=100 ; number++){ // to give numbers to inner for loop.
              int no_of_factors = 0; // to reset factor count.
              for (int i=1 ; i<=number ; i++){ // to run the 2nd condition
                  if (number%i==0)
                      no_of_factors++;
              } // closing of inner for loop
             if (no_of_factors==2) {
                 System.out.println(+number + " is prime");
             }// closing of IF condition
          }// closing of outer for loop
    }
}
