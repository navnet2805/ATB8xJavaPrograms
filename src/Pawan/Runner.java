package Pawan;

// palindrome
public class Runner {

    public static void main(String[] args) {
        int k = 2;
        String str = "geeksforgeeks"; //gksforgks
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray())
        {
            if (c=='e')
                continue;
            else
                res.append(c);
        }
        System.out.println(res);
    }
}
