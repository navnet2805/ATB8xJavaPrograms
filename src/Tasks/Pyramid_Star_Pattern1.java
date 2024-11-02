package Tasks;

public class Pyramid_Star_Pattern1 {
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *

    public static void main(String[] args) {
        for(int row=1; row<=5; row++){ //begin of outer for loop

            for (int col=4; col>=row; col--){ // begin of inner for loop
                System.out.print(" ");
            } // end of inner for loop

            for (int star=1; star<=row; star++){
                System.out.print("* ");
            }

            System.out.println();
        } // end of outer for loop
    }
}
