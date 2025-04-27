package InterviewQuestions.Java;

public class Program_15_String {

    public static void main(String[] args) {
        String str = "HelloWorld";
        String[] in = str.split("(?=[A-Z])"); //? means startswith

        for (String s : in)
        {
            System.out.println(s);
        }

        String str1 = "HelloWorld";
        String[] in1 = str1.split("(?=o)"); //? means startswith

        for (String s : in1)
        {
            System.out.println(s);
        }
    }
}
