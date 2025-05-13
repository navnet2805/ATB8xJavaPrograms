package Pawan;

public class PrintUnique {
    public static void main(String[] args) {
        String s="Java Automation";
        boolean[] unique=new boolean[128];
        StringBuilder result=new StringBuilder();
        for(char c : s.toCharArray()){
            if(!unique[c]){
                unique[c]=true;
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
