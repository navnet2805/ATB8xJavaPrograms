package Tasks;

import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int A = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("B: ");
        int B = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("C: ");
        int C = sc2.nextInt();

        int Result = (A>B)? ((A>C)?A:C) : ((B>C)?B:C) ;
        System.out.println("Greatest number is: " +Result);
    }
}
