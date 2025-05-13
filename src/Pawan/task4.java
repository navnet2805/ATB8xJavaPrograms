package Pawan;

public class task4 {

    /*
    Java program to Count Vowels and Consonants in a given string


     */

    public static void vowels_consonents(String s1 ){

        String str=s1.toLowerCase();
        int vowels=0;
        int consonents=0;
        String words=new StringBuilder(str).toString();

        for(char ch:str.toCharArray()){
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                vowels++;
            }
            else {
                consonents++;
            }
        }

        System.out.println("the count of vowels are : " + words + " - "+ vowels);
        System.out.println("the count of consonents are : " + words + " - "+ consonents);
    }

    public static void main(String[] args) {
        String str="PAwan";
        vowels_consonents(str);

    }

}
