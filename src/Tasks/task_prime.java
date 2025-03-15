package Tasks;

public class task_prime {
    public static void main(String[] args) {
        // Divisible by itself and 1
        int num=16;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println("the given number is prime : ");
                return;
            }

        }
        System.out.println("hence its a not a prime");
    }
}
