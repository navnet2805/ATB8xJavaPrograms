package Tasks;

public class Star_Left_Triangle_Pattern {
    public static void main(String[] args) {
        //*
        //***
        //*****
        //*******
        //*********

        for (int row=1 ; row<=5 ; row++){ // 5 is the number of rows
            for (int column=1 ; column<=(2*row-1) ; column++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

