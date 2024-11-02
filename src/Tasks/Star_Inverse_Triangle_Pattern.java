package Tasks;

public class Star_Inverse_Triangle_Pattern {
    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *

        for (int row=5 ; row>0 ; row--){
            for (int column=1 ; column<=row  ; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
