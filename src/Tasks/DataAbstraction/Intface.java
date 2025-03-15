package Tasks.DataAbstraction;

public interface Intface {
    int x = 100;

    void printmethod();

    static void printx() {
        System.out.println(x);
    }

        void printbash();

        default void printcash(){
            System.out.println("i am c, member from interface");
        }

}
