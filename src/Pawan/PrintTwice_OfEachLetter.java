package Pawan;

public class PrintTwice_OfEachLetter {
    public static void main(String[] args) {
        String s="Pawan";

        StringBuilder twicewords=new StringBuilder();

        for(char c: s.toCharArray()){
            twicewords.append(c);
            twicewords.append(c);

        }
        System.out.println(twicewords);
    }
}
