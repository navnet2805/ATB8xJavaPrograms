package Tasks;

public class StarPattern {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

        for (int row=1; row<=5; row++){
            for (int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row=1; row<=5; row++){
            for (int col1=4; col1>=row; col1--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
