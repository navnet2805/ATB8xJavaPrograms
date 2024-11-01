package Tasks;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
//Triangle Classifier ( If)
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

        Scanner sc = new Scanner(System.in);
        System.out.print("enter side1: " );
        int side1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("enter side2: " );
        int side2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter side3: " );
        int side3 = sc2.nextInt();

        if ((side1 == side2)&& (side2 == side3))
            System.out.println("Its an equilateral triangle");
        else if ((side1==side2)||(side2==side3)||(side3==side1))
            System.out.println("Its an isosceles triangle");
        else if ((side1!=side2)||(side2!=side3)||(side3!=side1))
            System.out.println("Its an scalene triangle");

    }
}
