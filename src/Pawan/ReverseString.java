package Pawan;

public class ReverseString {
    /*
    Step1 : Read the string
    Step2 : fetch each char from last and save it new variable
    Step 3: Then declare the new variable

     */

    public static void main(String[] args) {

        String s="Pawan";

        char ch;
        String result = "";

        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
           result = ch + result   ;
        }
        System.out.println(result);

    }
}
