package Tasks;

public class ClasCreation {

    public void talk(){
        System.out.println("I can talk");
    }

    public void sleep(){
        System.out.println("I can sleep");
    }

    static int age = 20;
    String name;
    public static void main(String[] args) {

        ClasCreation obj = new ClasCreation();
        System.out.println(age);
        obj.age = 30;


        ClasCreation obj1 = new ClasCreation();
        obj1.age = 40;
        System.out.println(obj.age);
        System.out.println(obj1.age);

    }
}
