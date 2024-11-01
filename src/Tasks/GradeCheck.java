package Tasks;

import java.util.Scanner;

public class GradeCheck {
//    Ternary Operators to handle multiple conditions.
// Input → int score = 85 (custom value)
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the score between(1-100): ");
    int score = sc.nextInt();

    char grade = (score<90)? ((score<80)? 'C' : 'B')  : 'A';
    System.out.println(grade);
}

}
