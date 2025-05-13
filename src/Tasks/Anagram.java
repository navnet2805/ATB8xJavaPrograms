package Tasks;

import java.util.Arrays;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2)
    {
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";
        boolean flag = false;

        flag = checkAnagram(str1,str2);

        if (flag)
            System.out.println("is a Anagram");
        else
            System.out.println("is not a Anagram");

    }
}
