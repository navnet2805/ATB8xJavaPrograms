package Pawan;

public class InterviewPrograms {

    /*
    String str=" I am good Person";
    output : " I ma good nosreP";
     */

    public static void main(String[] args) {

        String str = "I am good Person in java programming";

        String[] input = str.split(" ");

        for (int i = 0; i < input.length; i += 2) {
            input[i] = new StringBuilder(input[i]).reverse().toString();
        }
        System.out.println(String.join(" ",input));
    }
}
