package Pawan;

public class print_even_indexes {
    public static void main(String[] args) {
        String s="Pawan";

    for(int i=1;i<s.length();i++){
        if(i%2==0){
            System.out.println("the even indexes are : " + s.charAt(i));
        }
    }
    }
}

