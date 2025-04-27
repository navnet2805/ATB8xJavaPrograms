package InterviewQuestions.Java;

public class Program_16_String {
    public static void main(String[] args) {
        String str = "HelloWrold";
        String Str1 = str.substring(str.indexOf('H'),str.indexOf('W'));
        String Str2 = str.replace(Str1,"");
        System.out.println(Str2);
    }
}
