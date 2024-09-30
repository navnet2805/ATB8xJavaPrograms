package Tasks;

public class Swap2numbers {
    public static void main(String[] args) {
        //swap 2 numbers without using 3rd variable/number.
        // a=2 b=3
        int a = 2;
        int b = 3;
        b = a + b; //sum of 2 numbers
        a = b - a; // b value stored in a.
        b = b - a; // a value is stored in b
        System.out.println(a +" " +b);
    }
}
