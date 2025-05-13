package InterviewQuestions.Java;

public class Program21_Capgemini_String {
    public static void main(String[] args) {
        String str = "Test45@W"; // West45@T
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<str.length()-1 ; i++) //
        {
            sb.append(str.charAt(i)); //est45@
        }
        System.out.println(res.append(str.charAt(str.length()-1)).append(sb).append(str.charAt(0)));
    }
}
