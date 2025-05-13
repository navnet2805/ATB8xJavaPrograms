package Pawan;

import static Pawan.Countrepeated.input;

public class Upper_LowerCount {

 /*
    String str="WelCOme tO JavA";
    Step1 : Ignore spaces and make it has single String
    Step2 : convert String to char
    Step 3: Fetch each character and compare to lower or upper
    Step 4: Count and display

 */

    public static void main(String[] args) {
        String str="WelCOme tO JavA";

        int uppercount=0;
        int lowercount=0;

      String[] input=  str.split(" "); //['WelCOme', 'tO'. 'JavA']

        for (int i=0 ; i<input.length ; i++)
        {
            char[] c = input[i].toCharArray(); // []W e l C O m e]
            for (int j=0 ; j<c.length ; j++)
            {
                if (c[j]>='a' && c[j]<='z')
                    lowercount++;
                else if (c[j]>='A' && c[j]<='Z') {
                    uppercount++;
                }
            }
        }

        System.out.println("The count lower case letters in a String is : " + lowercount);
        System.out.println("The count upper case letters in a String is : " + uppercount);
    }
}
