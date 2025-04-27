package InterviewQuestions.Java;
/*
Write a java code
 input- This is a tcs interview
 output- weivretni tcs a si sihT
 */
public class Program_18_String {

    public static void main(String[] args) {
        String input = "This is a tcs interview";
        StringBuilder sb = new StringBuilder();
        String[] str = input.split(" ");

        for (int i=str.length-1 ; i>=0 ; i--)
        {
            StringBuilder temp = new StringBuilder();
            if (str[i].equals("tcs"))
                temp.append(str[i]);
            else{
                temp.append(str[i]).reverse();
            }
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }


}
