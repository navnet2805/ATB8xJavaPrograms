package Tasks;

public class ReverseAlternateWord {
/*
give string input = "i am good guy";
string output = "i ma good yug";
 */
    public static void main(String[] args) {
        String input = "i am good guy";
        StringBuilder output = new StringBuilder();

        String[] input1 = input.split(" ");

        for (int i=0 ; i<input1.length ; i++)
        {
            if (i%2==0)
            {
                String s = input1[i];
                output.append(s);
            }
            else
            {
                StringBuilder temp = new StringBuilder(input1[i]);
                output.append(temp.reverse());
            }
            output.append(" ");
        }
        System.out.println(output);
    }
}
