package Pawan;

public class parent
{
   /*       *           *
            **         **
            ***       ***
            ****     ****
            *****
   */

    public static void main(String[] args)
   {
    for(int row=1;row<=5;row++){
        for(int col=5;col>=row;col--){
            System.out.print("");
        }
        for(int star=1;star<=row;star++){
            System.out.print("*");
        }
        System.out.println();
    }
   }

}

