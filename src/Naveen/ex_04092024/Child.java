package Naveen.ex_04092024;

public class Child extends Person {
    int a,b;
    Child(int a, int b){
        super();
        System.out.println("child param const");

    }

    Child(){
        super(1,2);
        System.out.println("child default const");
    }

    public static void main(String[] args) {
        Child obj = new Child(1,2);




    }
}
