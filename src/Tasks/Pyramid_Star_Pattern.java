package Tasks;

public class Pyramid_Star_Pattern {
    public static void main(String[] args) {
//        *
//       ***
//      *****
//     *******
//    *********


        for (int row = 1; row<=5; row++) {
            for (int column = 4; column>= row; column--) {
                System.out.print(" ");
            }
            for (int star=1; star<=2*row-1 ; star++){
                System.out.print("*");
            }
          System.out.println();
        }

    }
}
