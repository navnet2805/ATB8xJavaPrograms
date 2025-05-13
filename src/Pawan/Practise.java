package Pawan;

public class Practise {
    //Armstrong
    // if i take 3 digit number
    // 163 = 1*1*1 + 6*6*6 + 3*3*3 = 163
    //1. number of digits.
    //2. for each number shd be mul with number of digits with their sum
    //3. actual number == res ---> armstrong number
    public static void main(String[] args) {

        int i=2, j=5, k;

        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        //= 2 - 1 + 4 - 5 + 1-5 + 2 - 4

        System.out.println("i="+i); // 2
        System.out.println("j="+j); //5
        System.out.println("k="+k); // -6

    }
}
