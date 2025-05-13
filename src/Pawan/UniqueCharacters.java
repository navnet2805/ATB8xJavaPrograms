package Pawan;

public class UniqueCharacters
{
    /*
    Java program to print unqiue characters
    Enter a string: Java Automation
    Unique characters in "Java Automation":
    Output : J a v A u t o m i n
     */

    public static void unique(String s1)
    {

        boolean b[] = new boolean[128];
        String[] str1 = s1.split(" ");
        //String str = s1.toLowerCase();


        for (int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);
            if (!b[ch])
            {
                b[ch]= true;
                System.out.printf(ch + " ");

            }

        }

    }


    public static void main(String[] args) {
        String str="Java Automation";

        unique(str);
    }
}

