package Tasks;

public class LeapYear {
    public static void main(String[] args) {
        // 1st condition : year shd be divisible by 400.
        // 2nd condition : year shd be divisible by 4 and not divisible by 100

        for (int i=1990 ; i<=2025 ; i++){
            if (i%400==0 || (i%4==0 && i%100!=0)) {
                System.out.println(+i + " is a leap year");
            }
        }

    }
}
