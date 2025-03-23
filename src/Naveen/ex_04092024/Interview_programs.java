package Naveen.ex_04092024;

public class Interview_programs {

    /*
User Input = 3
03 06 09
18 15 12
21 24 27
     */
    public static void main(String[] args) {
        int col=3;
        for(int row=1;row<=3;row++)
        {
            for(col=3;col>=row;col--)
            {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
