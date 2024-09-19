package Sept;

public class IncrDecrProgram {
    public static void main(String[] args) {
    int a = 10;
System.out.println(  --a + a-- + a--);
 System.out.println("Value of a= " + a);

        int b = 10;
        System.out.println(--b + b++ + b--);
        System.out.println("Value of b= " +b);


        int c = 10;
        System.out.println(c-- + c-- + c--);
        //                10 + 9 + 8
        System.out.println("Value of c= " +c);
        // 7
    }
}
