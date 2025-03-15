package Naveen.ex_04092024;

public class Person {
    int a,b;
    //parm
    Person(int a, int b){
        System.out.println("Parent param const");
    }

    Person(){
        this(1,2);
        System.out.println("Parent default const");
    }

    public static void main(String[] args) {
        new Person();

    }



}
