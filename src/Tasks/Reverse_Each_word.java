package Tasks;

public class Reverse_Each_word {

    /*
    Java program to reverse each word of a given string
       Input: Java is good programming langauges
       Output: avaJ si doog gnimmargorp seguagnal

       Each word reversed and save
       add each word next to it then display.

     */
    public static void main(String[] args) {


        String s = "Java is good Programming Language ";

        String[] words = s.split(" "); // ["Java","is","good","programming","langauges"]
        String reverseString ="";

        for(String w:words)
        {
              String reversedwords= "";

              for(int i=w.length()-1;i>=0;i--){

                  reversedwords = reversedwords+ w.charAt(i) ;

              }

            reverseString =reverseString + reversedwords +" ";
        }
        System.out.println(reverseString);


    }

}
