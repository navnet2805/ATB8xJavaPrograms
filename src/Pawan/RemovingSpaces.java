package Pawan;

public class RemovingSpaces {

    /*
    Java program to remove space from given string

   Step 1: read the String
   use Split method to add space as a character
   step3: using charAt we use index to calculate 'space' as character

     */
    public static void main(String[] args) {
        String s="Welcome to Java";

        StringBuilder removedSpace=new StringBuilder();

        String[] s1=s.split(" ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                removedSpace.append(s.charAt(i));
            }

        }

        System.out.println(removedSpace);
    }
}
