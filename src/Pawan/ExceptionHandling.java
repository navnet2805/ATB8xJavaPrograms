package Pawan;

public class ExceptionHandling {
    public static void main(String[] args) {
        int b= 0;
        try {
            int a=0;
            b = 10/a;
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println(b);
    }




}
