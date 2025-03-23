package Tasks;

public class Pcrunner extends Child1 {
    int c=10;
    public void runner(){
        System.out.println("I am from runner");
    }

    public static void main(String[] args) {
       Pcrunner obj = new Pcrunner();
       obj.show();


    }
}
