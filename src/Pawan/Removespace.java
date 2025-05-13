package Pawan;

public class Removespace {
    /*
    Java program to remove space from a given string
     */

    public  static void remove_space(String input) {

        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                str1.append(input.charAt(i));
            }
        }
        System.out.println(str1);

    }
    public static void main(String[] args) {
        String s="Pawan automation java selenium";
        remove_space(s);

    }
}
