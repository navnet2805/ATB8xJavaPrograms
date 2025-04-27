package InterviewQuestions.Java;
/*
String “GoodMorningGoodAfternoonGoodNight”
output = “GoodMorningGoodAfternoonBadNight”
Replace 3rd good with bad.
 */
public class Program_09_ReverseStringSpecificWord {

    public static void main(String[] args) {

        String str = "GoodMorningGoodAfternoonGoodNight";

        //Logic to find the index for the 3rd Good.
//        for (char c : str.toCharArray())
//        {
//            System.out.println(str.charAt(str.indexOf(c)) + " : "+str.indexOf(c));
//        }

        StringBuilder input = new StringBuilder("GoodMorningGoodAfternoonGoodNight");
        input.replace(24,28,"Bad");
        System.out.println("original string: " +str);
        System.out.println("replaced string: " +input);

    }
}
