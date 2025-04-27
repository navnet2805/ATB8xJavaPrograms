package InterviewQuestions.Java;

/*
Write a program to get output like below:
user input=3
03 06 09
18 15 12
21 24 27

user input=4
04 08 12 16
32 28 24 20
36 40 44 48
64 60 56 52

Note: No array or Collection must be used
 */

public class Program03 {

    public static void main(String[] args) {
        int user_input = 03;
        int count = 1;

        for (int row = 1; row <= user_input; row++) {
            if (row % 2 != 0) //odd
            {
                for (int col = 1; col <= user_input; col++) {
                    int values = user_input * count++;
                    System.out.print(values + " ");

                }
                System.out.println(); // nextline
               count = count + (user_input-1);
            } else if (row % 2 == 0) //even
            {
                for (int col = 1; col <= user_input; col++) {
                    int values = user_input * count--;
                    System.out.print(values + " ");

                }
                System.out.println();
                count = count+ (user_input+1);
            }
        }
    }
}

/*
for(row)
{
for(col)
}
 */

/*
output:
4
8
12

 */
