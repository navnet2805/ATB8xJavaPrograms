package Pawan;

public class Count_No_Of_Words {

    /*
    step1 :  conversion string into array
    step2 : fetch each by one
    step3 : if you find any space then the word ends and make it has count 1
    step 4 : complete the string and display each word count
     */
    public static void main(String[] args) {

        String s = "w elcome to java to";

        int count=1;
        for(int i=1;i<=s.length()-1;i++){
            if((s.charAt(i) == ' ')) {
                count++;

            }
        }
        System.out.println(count);

    }
}
