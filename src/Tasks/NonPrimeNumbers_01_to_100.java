package Tasks;

public class NonPrimeNumbers_01_to_100 {
    public static void main(String[] args) {
        int serial_number = 0;

        for (int number = 2; number <=100 ; number++) {
            int reset = 0;
            for (int i = 1; i <= number; i++) {
                if (number%i==0)
                    reset++;
            }
            if (reset==2) {
                serial_number += 1;
                System.out.println(+serial_number +". " +number + " not a prime number");
            }

        }
    }
}
