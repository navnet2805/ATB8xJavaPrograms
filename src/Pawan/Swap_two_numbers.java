package Pawan;

public class Swap_two_numbers {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        //Before Swapping
        System.out.println("before Swapping the numbers: " + "a : " + a + " and " + "b : " + b);

        //After Swapping
        a=a+b;// 10 + 5 =15  a=15;
        b=a-b;// 15-5 = 10 b=10;
        a=a-b;//15-10 =5  a=5;

        System.out.println("After Swapping the numbers: " + "a : " + a + " and " + "b : " + b);




    }



}
