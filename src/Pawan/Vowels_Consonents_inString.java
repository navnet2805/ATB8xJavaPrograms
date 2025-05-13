package Pawan;

public class Vowels_Consonents_inString {
    public static void main(String[] args) {
        String s="Pawan";
        s.toLowerCase();
        int vowles=0;
        int consonents=0;
       String[] s1= s.split(" ");
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){

                vowles++;
            }
            else {
                consonents++;
            }
        }
        System.out.println(s);
        System.out.println("The number of volwes in a string is : " + vowles);
        System.out.println("The number of consonents in a string is : " + consonents);

    }
}
