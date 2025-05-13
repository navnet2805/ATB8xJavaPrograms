package Pawan;

public class String_plaindrome {
    public static void main(String[] args) {
        String s="madam";

        String result="";
          String rev="";
          int length = s.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
            result=rev;
        }
        if(result.equals(s)){
            System.out.println("Hence its a palindrome");
        }else{
            System.out.println("hence its not a plaindrome");
        }
    }
}

