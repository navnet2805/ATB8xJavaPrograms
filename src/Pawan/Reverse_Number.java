package Pawan;

public class Reverse_Number {
    public static void main(String[] args) {
        int a=367465;
        int rev = 0;

        while(a!=0){
            rev=rev*10+a%10;//5
            a=a/10;//36746
        }
        System.out.println(rev);


    }
}
