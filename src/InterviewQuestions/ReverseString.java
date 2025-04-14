package InterviewQuestions;

public class ReverseString {
//Reverse string “Test@59I” but ‘@59’ should not be reversed

    public static String reverseLetterString(String str)
    {
        char[] c = str.toCharArray();
        int right = c.length-1;
        int left = 0;

        while (left<right)
        {
            if (Character.isLetter(c[right])) //if it is letter then only apply reverse logic
            {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
            }
            left++;
            right--;
        }

        return new String(c);
    }

    public static void main(String[] args) {

        String str = "Test@59I";
        String result = reverseLetterString(str);
        System.out.println(result);
    }
}
